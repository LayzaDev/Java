package maquina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        MaquinaDePassagem mp = new MaquinaDePassagem(2);
        
        int opcao;
        
        do{
            System.out.println("\nEscolha uma opcao: ");
            System.out.println("1. Comprar passagem");
            System.out.println("2. Visualizar preco da passagem");
            System.out.println("3. Encerrar atividade");
            
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    float valor = 0;
                    
                    System.out.println("\nInsira o valor que irá pagar a passagem: ");
                    valor = scan.nextFloat();
                    
                    do { 
                        if(valor == 1){
                            System.out.println(mp.mostraPrecoPassagem() 
                                        + "\nVocê inseriu " + valor 
                                        + "\n\ninsira o restante para realizar a compra: "
                            );  
                            float valorAtual = valor;
                            valor = scan.nextFloat();
                            valor += valorAtual;
                            
                        } else if(valor > 2){
                            System.out.println("\nTroco a receber: " + mp.getRetornaTroco() + "\n");
                            break;
                        }
                    } while(valor < 2);
                    
                    mp.inserirDinheiro(valor);
                    System.out.println(mp.emitirPassagem());
                    
                    break;
                case 2:
                    System.out.println(mp.mostraPrecoPassagem());
                    break;
                case 3:
                    System.out.println("\nEncerrando....");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        } while(opcao != 3);
    }
}
