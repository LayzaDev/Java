package empregado;

import java.io.*;
 
public class Empregado implements Comparable<Empregado>, Serializable {
   
    String cpf;
    int idade;
    double salario;
    
    public Empregado(String cpf, int idade, double salario){
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }
    
    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Empregado outro){
        return Integer.compare(this.idade, outro.idade);
    }
    
    public void mostraDados(){
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: R$" + getSalario());
    }
}
