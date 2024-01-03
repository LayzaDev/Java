package conta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Conta[] conta = new Conta[5];
        Scanner scan = new Scanner(System.in);
        int op, contador = 0;
        String nome;
        int numero;
        
        do{
            System.out.println("1) Cadastrar conta");
            System.out.println("2) Logar na conta");
            System.out.println("3) Sair");
            
            op = scan.nextInt();
            
            switch(op){
                case 1: 
                    System.out.println("Nome: ");
                    nome = scan.next();
                    System.out.println("Numero da conta: ");
                    numero = scan.nextInt();
                    conta[contador] = new Conta(nome, numero);
                    contador++;
                    break;
                case 2:
                    System.out.println("Nome: ");
                    nome = scan.next();
                    System.out.println("Numero da conta: ");
                    numero = scan.nextInt();
                    scan.nextLine();
                    int opcao = 0;
                    for(int i = 0; i < contador; i++){
                        do{
                        
                            if(conta[i].getNumero() == numero){
                                System.out.println("1) Sacar");
                                System.out.println("2) Depositar");
                                System.out.println("3) Visualizar saldo");
                                System.out.println("4) Sair");
                                opcao = scan.nextInt();
                                switch(opcao){
                                    case 1:
                                        System.out.println("\nInforme o valor que deseja sacar: ");
                                        double valor = scan.nextDouble();
                                        conta[i].sacar(valor);
                                        break;
                                    case 2:
                                        System.out.println("\nInforme o valor que deseka depositar: ");
                                        double valorD = scan.nextDouble();
                                        conta[i].depositar(valorD);
                                        break;
                                    case 3:
                                        conta[i].visualizarSaldo();
                                        break;
                                    default:
                                        System.out.println("\nOpcao invalida");
                                        break;
                                }    
                            }
                        }while(opcao != 4);
                    } 
                    break;
                case 3:
                    System.out.println("\nEncerrando");
                    break;
                default:
                    System.out.println("\nOpcao Invalida");
                    break;
            }
        } while(op != 4);
        
        
    }
    
}
