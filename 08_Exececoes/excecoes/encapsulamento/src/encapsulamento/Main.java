package encapsulamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
       
        int opcao;
        do{
            System.out.println("\nEscolha uma opcao: ");
            System.out.println("1. Calcular distancia entre dois pontos");
            System.out.println("2. Operações com circulo");
            System.out.println("3. Encerrar");
            
            opcao = scan.nextInt();
            
            Ponto p1 = new Ponto();
            Ponto p2 = new Ponto();
            
            switch(opcao){
                case 1:
                    
                    float X1, X2, Y1, Y2;
                    
                    int op;
                    
                    do{
                        System.out.println("\nEscolha uma opcao:");
                        System.out.println("1. Inserir coordenadas e calcular a distancia entre elas");
                        System.out.println("2. Alterar valor do ponto X");
                        System.out.println("3. Alterar valor do ponto Y");
                        System.out.println("4. Visualizar valores dos pontos X e Y");
                        System.out.println("5. Calcular distancia entre coordenadas");
                        System.out.println("6. Sair");

                        op = scan.nextInt();

                        if(op == 1){

                            System.out.println("\nValor de X1: ");
                            X1 = scan.nextFloat();
                            
                            System.out.println("Valor de Y1: ");
                            Y1 = scan.nextFloat();
                            
                            p1.setPonto(X1, Y1);

                            System.out.println("\nValor de X2: ");
                            X2 = scan.nextFloat();
                            
                            System.out.println("\nValor de Y2: ");
                            Y2 = scan.nextFloat();
                            
                            p2.setPonto(X2, Y2);
                            
                        } else if(op == 2){
                            
                            System.out.println("\nNovo valor para X: ");
                            float novoX = scan.nextFloat();
                            p1.setX(novoX);
                            
                        } else if(op == 3){
                            
                            System.out.println("\nNovo valor para Y: ");
                            float novoY = scan.nextFloat();
                            p1.setY(novoY);
                            
                        } else if(op == 4){
                            
                            System.out.println("\nP1( " + p1.getX() + ", " + p1.getY() + ")");
                            System.out.println("\nP2( " + p2.getX() + ", " + p2.getY() + ")");
                            
                        } else if(op == 5){
                            
                            double distancia = p1.calculaDistancia(p2);
                            System.out.println("\nDistancia entre P1 e P2: " + distancia);
                            
                        } else {
                            
                            System.out.println("\nVoltando para o menu principal...");
                        }
                    } while(op != 6);
                    
                    break;
                case 2:
                    
                    double raio;
                    int op2;
                    
                    Circulo C = new Circulo();
                    do{
                        System.out.println("\nEscolha uma opcao:");
                        System.out.println("1. Criar circulo");
                        System.out.println("2. Acessar e modificar nome do circulo");
                        System.out.println("3. Exibir dados do circulo");
                        System.out.println("4. Sair");
                        
                        op2 = scan.nextInt();
                        
                        if(op2 == 1){
                            System.out.println("\nValor do raio: ");
                            raio = scan.nextDouble();
                            C.setCirculo(raio, p1);
                        } else if(op2 == 2){
                            System.out.println("\nNome atual: " + C.getNome());
                            System.out.println("\nDeseja modificar esse nome? (S/N)");
                            String mod = scan.next();
                            
                            if(mod != "N"){
                                System.out.println("\nInsira o novo nome: ");
                                String novoNome = scan.next();
                                C.setNome(novoNome);
                            } 
                        } else if(op2 == 3){
                            System.out.println(C.toString());
                        } else {
                            System.out.println("\nVoltando para o menu principal...");
                        }
                    } while(op2 != 4);
                    break;
                case 3:
                    System.out.println("\nEncerrando atividade...");
                    break;
                default:
                    System.out.println("\nOpcao Invalida!");
            }
        } while(opcao != 3);
    }
}
