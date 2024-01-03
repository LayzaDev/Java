package empresa;

public class Comissionado extends Funcionarios{
    private double comissao;
    private int numVendas;
    
    public Comissionado(int mat, String nome, int idade, String cpf, int numVendas){
        super(mat, nome, idade, cpf);
        this.comissao = 0.05;
        setNumVendas(numVendas);
    }
    
    public double getComissao(){
        return comissao;
    }
    
    public int getNumVendas(){
        return numVendas;
    }
    
    public void setNumVendas(int num){
        this.numVendas += num;
    }
    
    public double calculaComissao(){
        return this.numVendas * this.comissao;
    }
    
    @Override
    public double calculaSalarioMensal(){
        double salarioTotal = super.getSalarioBase() + calculaComissao();
        return salarioTotal;
    }
    
    
    @Override
    public String mostraDados(){
        return super.mostraDados();
    }
    
    @Override
    public String mostraFolhaPagamento(){
        return super.mostraDados()
                + "\nComissao: " + this.comissao
                + "\nNumero de vendas: " + this.numVendas
                + "\nComissao a receber: " + calculaComissao()
                + "\nSalario a receber: " + calculaSalarioMensal(); 
    }
}
