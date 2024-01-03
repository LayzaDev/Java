package empresa;

public abstract class Funcionarios {
    
    private int mat, idade;
    private String nome, cpf;
    private float salarioBase;
    
    public Funcionarios(int mat, String nome, int idade, String cpf){
        this.mat = mat;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salarioBase = 2000;
    }
    
    public int getMat(){
        return mat;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public float getSalarioBase(){
        return salarioBase;
    }
    
    public abstract String mostraFolhaPagamento();
    public abstract double calculaSalarioMensal();
    
    public String mostraDados(){
        return "\nMatricula: " + mat
                + "\nNome: " + nome
                + "\nIdade: " + idade
                + "\nCPF: " + cpf
                + "\nSalario base: " + salarioBase;
    }       
}

