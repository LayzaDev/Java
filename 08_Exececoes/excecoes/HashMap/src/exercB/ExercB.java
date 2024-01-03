package exercB;

import exercB.ExB.Empregado;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class ExercB {

    public static void main(String[] args) {
        
       Map<String, Empregado> empregadoMap = new HashMap<>();
       Scanner scan = new Scanner(System.in);
       
       int opcao = 0;
       
       do{
            System.out.println("1. Cadastrar empregados");
            System.out.println("2. Procurar empregado");
            System.out.println("3. Verificar salários");
            System.out.println("4. Empregado com menor salário");
            System.out.println("5. Empregado com maior salário");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            
            String cpf, pesquisa;
            int idade;
            double salario;
            
            switch(opcao){
                case 1:
                    System.out.println("\nCPF: ");
                    cpf = scan.next();
                    System.out.println("\nIdade: ");
                    idade = scan.nextInt();

                    double salarioEmpregado = 0;
                    Boolean salarioValido = false;

                    while(!salarioValido){
                        try{
                            System.out.println("\nSalario: ");
                            salarioEmpregado = scan.nextDouble();
                            salarioValido = true;
                        } catch(InputMismatchException e){
                            System.out.println("\nValor de salário inválido. Digite novamente.");
                            scan.nextLine();
                        }
                    }
                       
                    Empregado emp = new Empregado(cpf, idade, salarioEmpregado);
                    empregadoMap.put(cpf, emp);
                    break;
                case 2:
                    System.out.println("\nInforme o CPF do funcionario: ");
                    pesquisa = scan.next();
                    Empregado empregado = empregadoMap.get(pesquisa);
                    if(empregado != null){
                        empregado.mostraDados();
                    } else {
                        System.out.println("\nEmpregado não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("\nInforme o valor do salario: ");
                    salario = scan.nextDouble();
                    for(Empregado empregados : empregadoMap.values()){
                        if(empregados.getSalario() > salario){
                            System.out.println("CPF: " + empregados.getCpf());
                        } else {
                            System.out.println("CPF: " + empregados.getCpf());
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nInforme o valor do salario: ");
                    salario = scan.nextDouble();
                    for(Empregado empregados : empregadoMap.values()){
                        if(empregados.getSalario() < salario){
                            System.out.println("CPF: " + empregados.getCpf());
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nEncerrando");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
                    break;
            }
           
       }while(opcao != 6);
    }
    
}
