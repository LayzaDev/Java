package Empregado;

import java.util.HashMap;
import java.util.Scanner;

public class HashMain {
    public static void main(String[] args){
      
        HashMap<String, Empregado> hashEmpregados = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++){
            System.out.println("CPF: ");
            String cpf = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();
            
            hashEmpregados.put(cpf, new Empregado(cpf, idade, salario));
        }
        
        int n;
        
        do{
            System.out.println("0.Sair"
                    + "\n1.Buscar empregado por CPF"
                    + "\n2.Buscar empregados com salario maior e menor\n");
            n = sc.nextInt();
            
            switch(n){
                case 1:
                    System.out.println("\nCPF: ");
                    String cpf = sc.next();
                    
                    Empregado e = hashEmpregados.get(cpf);
                    
                    System.out.println("Empregado encontrado - CPF: " + e.getCPF() + ", Idade: " + e.getIdade() + ", Salario: " + e.getSalario());
                    break;
                case 2:
                    Empregado maiorSalario = null;
                    Empregado menorSalario = null;
                    
                    for(Empregado value : hashEmpregados.values()){
                        if(maiorSalario == null || maiorSalario.getSalario() < value.getSalario()){
                            maiorSalario = value;
                        } 
                        if(menorSalario == null || menorSalario.getSalario() > value.getSalario()){
                            menorSalario = value;
                        }
                    }
                    
                    System.out.println("\nEmpregado encontrado com maior salario - CPF: " + maiorSalario.getCPF() + ", Idade: " + maiorSalario.getIdade() + ", Salário: " + maiorSalario.getSalario());
                    System.out.println("\nEmpregado encontrado com menor salario - CPF: " + menorSalario.getCPF() + ", Idade: " + menorSalario.getIdade() + ", Salário: " + menorSalario.getSalario());
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while(n != 0);
        sc.close();
    }   
    
}
