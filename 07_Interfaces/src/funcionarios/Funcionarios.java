package funcionarios;

public abstract class Funcionarios {
    
    private String nome, mat;
    private double salario_base;
    
    public Funcionarios(String nome, String mat){
        this.nome = nome;
        this.mat = mat;
        this.salario_base = 2000;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMat(){
        return mat;
    }
    
    public double getSalarioBase(){
        return salario_base;
    }
    
    public abstract double calculaSalario();

    public String mostraDados(){
        return "\nNome: " + nome
                + "\nMatricula: " + mat
                + "\nsalario_base: " + salario_base;
    }
}
