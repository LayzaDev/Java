package Funcionario;

public class FuncionarioNoturno extends Funcionarios {
  
    private float adicionalTrabNoturno, salarioBase;
    private int numNoitesTrabalhadas;
    
    public FuncionarioNoturno(int matricula, String nome, String cpf, int idade, int noitesTrabalhadas){
        super(matricula, nome, cpf, idade);
        this.salarioBase = 2000;
        this.adicionalTrabNoturno = 30;
        this.numNoitesTrabalhadas = noitesTrabalhadas;
    }
    
    public float getAdicional(){
        return adicionalTrabNoturno;
    }
    
    public int computaNumNoites(){
        return numNoitesTrabalhadas++;
    }
    
    @Override
    public float calculaSalario(){
        return salarioBase + adicionalTrabNoturno * numNoitesTrabalhadas;
    }
    
    @Override 
    public String toString(){
        return super.toString() + ", Salario Mensal: " + calculaSalario();
    }
}
