package tempo;

import java.util.Scanner;  

public class Main {
  
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);

        int opcao;

        Tempo tempo = new Tempo(00, 00, 00);

        do{

            System.out.println("\nEscolha uma opcao: ");
            System.out.println("1. Visualizar hora no formato (hh:mm:ss)");
            System.out.println("2. Visualizar hora no formato (hh:mm:ss AM/PM)");
            System.out.println("3. Incrementar hora, minuto ou segundo");
            System.out.println("4. Decrementar hora, minuto ou segundo");
            System.out.println("5. Encerrar atividade");

            opcao = scan.nextInt(); 

            switch(opcao){
                case 1: 
                    System.out.println("\n======================\n");
                    System.out.println(tempo.formatarHora1());
                    System.out.println("\n======================\n");
                    break;
                case 2: 
                    System.out.println("\n======================\n");
                    System.out.println(tempo.formatarHora2());
                    System.out.println("\n======================\n");
                    break;
                case 3:
                    int op;
                    do{
                        System.out.println("1. Incrementar hora");
                        System.out.println("2. Incrementar min");
                        System.out.println("3. Incrementar seg");
                        System.out.println("4. Parar");
                        
                        op = scan.nextInt();

                        switch (op) {
                            case 1:
                                tempo.incrementarHora();
                                break;
                            case 2:
                                tempo.incrementarMin();
                                break;
                            case 3:
                                tempo.incrementarSeg();
                                break;
                            case 4:
                                System.out.println("\nVoltando ao menu principal...");
                            default:
                                System.out.println("\nOpcao invalida");
                                break;
                        }
                    } while(op != 4);
                    break;
                case 4:
                    int op2;
                    do{
                        System.out.println("\n1. Incrementar hora");
                        System.out.println("2. Incrementar min");
                        System.out.println("3. Incrementar seg");
                        System.out.println("4. Parar");
                        
                        op2 = scan.nextInt();

                        switch (op2) {
                            case 1:
                                tempo.decrementarHora();
                                break;
                            case 2:
                                tempo.decrementarMin();
                                break;
                            case 3:
                                tempo.decrementarSeg();
                                break;
                            case 4:
                                System.out.println("\nVoltando ao menu principal...");
                            default:
                                System.out.println("\nOpcao invalida");
                                break;
                        }
                    } while(op2 != 4);
                    break;
                case 5:
                    System.out.println("\nEncerrando...");
                    break;
                default:
                    System.out.println("\nOpcao Invalida...");
                    break;
            }
        } while (opcao != 5);
    }
}
