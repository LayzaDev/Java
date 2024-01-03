package funcionarios;

public class Vendedor extends Funcionarios{
    
    private int numVendas;
    private double comissao;
    
    public Vendedor(String nome, String mat, int numVendas){
        super(nome, mat);
        this.numVendas = numVendas;
        this.comissao = 0.8;
    }
    
    public int getNumVendas(){
        return numVendas;
    }
    
    public double getComissao(){
        return comissao;
    }
    
    @Override
    public double calculaSalario(){
        double totalComissao = numVendas * comissao;
        return super.getSalarioBase() + totalComissao;
    }
    
    @Override
    public String mostraDados(){
        return super.mostraDados() 
                + "\nNumero de vendas: " + numVendas
                + "\nSalario total: " + calculaSalario();
    }
}
