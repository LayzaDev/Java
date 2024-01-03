package Empregado;

import java.io.Serializable;

public class Empregado implements Comparable<Empregado>, Serializable{
    
    private static final long serialVersionUID = 1L;
    private String cpf;
    private int idade;
    private double salario;
    
    public Empregado(String cpf, int i, double s){
        this.idade = i;
        this.cpf = cpf;
        this.salario = s;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    @Override
    public int compareTo(Empregado e){
        if(this.idade > e.getIdade()){
            return 1;
        } else if(this.idade < e.getIdade()){
            return -1;
        } else {
            return 0;
        }
    }
}
