package comandosbasicos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   
        
        Scanner scan = new Scanner(System.in);
        
        MensagemInicial msg = new MensagemInicial();
        
        System.out.println("\n*****************************************************************************");
        System.out.println(msg.mostraDados());
        System.out.println("*****************************************************************************");
            
        SomaDoisNumeros soma = new SomaDoisNumeros();
        
        float num1 = (float) 15.6;
        float num2 = 10;
        
        int opcao;
        
        do{
            System.out.println("\n1. Calcular soma");      
            System.out.println("2. Operações com triangulos");
            System.out.println("3. Calculo da distancia entre dois pontos");       
            System.out.println("4. Cadastrar um cliente");
            System.out.println("Escolha uma opcao: ");
            
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("\nSOMA\n");
                    System.out.println(num1 + " + " + num2 + " = " + soma.calculaSoma(num1, num2));
                    break;
                case 2:
                    
                    Triangulo listaDeTriangulos[] = new Triangulo[10];
                    int op;
                    
                    do{
                        Triangulo triangulo = new Triangulo();
                        int contador = 1;
                        int numEquilateros = 0;
                        
                        System.out.println("1. Inserir triangulo");
                        System.out.println("2. Mostrar triangulos cadastrados");
                        System.out.println("3. Mostrar o numero de triangulos equilátero");
                        System.out.println("4. Mostrar o triangulo cadastrado com maior perímetro");
                        System.out.println("5. Encerrar atividade");            
                        System.out.println("Escolha uma opcao: ");
                        
                        op = scan.nextInt();
                        
                        if(op == 1){
                            
                            System.out.println("\nLado 1: ");
                            double l1 = scan.nextDouble();
                            System.out.println("\nLado 2: ");
                            double l2 = scan.nextDouble();
                            System.out.println("\nLado 3: ");
                            double l3 = scan.nextDouble();

                            triangulo.setTriangulo(l1, l2, l3, contador);
                            listaDeTriangulos[contador] = triangulo;
                            contador++;
                            
                        } else if(op == 2){
                            
                            for(int i = 0; i < contador; i++){
                                System.out.println(listaDeTriangulos[i].toString());
                            }                           
                        } else if(op == 3){
                            for(int i = 0; i < contador; i++){
                                String tipo = listaDeTriangulos[i].classificaTriangulo();
                                if(listaDeTriangulos[i].equals(tipo)){
                                    numEquilateros++;
                                }
                            }
                        }
                    } while(op != 5);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("\nSaindo do programa...\n");
                    break;
                default:
                    System.out.println("\nOpção Invalida!");
                    break;
            }
        } while(opcao != 5);
    }
}
