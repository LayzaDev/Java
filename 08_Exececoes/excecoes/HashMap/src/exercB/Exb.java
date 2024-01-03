package exercB;

import java.io.*;

public class Exb {
    
    public static class Empregado implements Serializable {
        private String cpf;
        private int idade;
        private double salario;

        public Empregado(String cpf, int idade, double salario) {
            setCpf(cpf);
            setIdade(idade);
            setSalario(salario);
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public void mostraDados() {
            System.out.println("CPF: " + getCpf());
            System.out.println("Idade: " + getIdade());
            System.out.println("Salário: R$" + String.format("%.2f", getSalario()));
            System.out.println();
        }
    }
}
