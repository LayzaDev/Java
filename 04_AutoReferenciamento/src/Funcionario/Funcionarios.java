package Funcionario;

public abstract class Funcionarios {
    
    private int matricula, idade;
    private String nome, CPF;
   
    public Funcionarios(int matricula, String nome, String cpf, int idade){
        this.matricula = matricula;
        this.nome = nome;
        this.CPF = cpf;
        this.idade = idade;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCPF(){
        return CPF;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public abstract float calculaSalario();
    
    
    public String toString(){
        return "Nome: " + nome + ", Matricula: " + matricula + ", CPF: " + CPF + ", Idade: " + idade;
    }
}
