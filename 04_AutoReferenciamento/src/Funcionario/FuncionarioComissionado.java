package Funcionario;

public class FuncionarioComissionado extends Funcionarios {
  
    private float comissao, salarioBase;
    private int numVendas;
    
    public FuncionarioComissionado(int matricula, String nome, String cpf, int idade, int numVendas){
        super(matricula, nome, cpf, idade);
        this.comissao = 0.5f;
        this.numVendas = numVendas;
        this.salarioBase = 1500;
    }
    
    public void computaVendas(){
        numVendas++;
    }
    
    @Override
    public float calculaSalario() {
        float valorComissoes = numVendas * comissao;
        return salarioBase + valorComissoes;
    }
    
    
    @Override 
    public String toString(){
        return super.toString() + ", Salario Mensal: " + calculaSalario();
    }
}
