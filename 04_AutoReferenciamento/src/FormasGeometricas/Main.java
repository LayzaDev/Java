//Layza Nauane de Paula Silva - 12211BSI251
package FormasGeometricas;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int opcao, contador = 0; 
        String cor;
        int id;
        float x, y, z;
        
        Forma v[] = new Forma[10];
        
        do{
            
            System.out.println("\nEscolha um opcao: \n");
            System.out.println("1. Cadastrar uma forma");
            System.out.println("2. Mostrar uma descrição textual de todas as formas cadastradas");
            System.out.println("3. Mostrar área das formas bidimensionais cadastradas");
            System.out.println("4. Mostrar o volume das formas tridimensionais cadastradas");
            System.out.println("5. Verifique no vetor se existem duas esferas ou dois círculos que se interceptam ou não");
            System.out.println("6. Sair");
            
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    
                    System.out.println("\nEscolha uma forma: \n");
                    System.out.println("1. Circulo");
                    System.out.println("2. Quadrado");
                    System.out.println("3. Triângulo");
                    System.out.println("4. Esfera");
                    System.out.println("5. Cubo");
                    System.out.println("6. Tetraedro");
                    
                    int op = scan.nextInt();
                    
                    System.out.println("\nCor: ");
                    cor = scan.next();

                    System.out.println("\nId");
                    id = scan.nextInt();
                    
                    switch(op){
                        case 1: 
                            
                            System.out.println("\nPontos(x, y): ");
                            x = scan.nextFloat();
                            y = scan.nextFloat();

                            System.out.println("\nRaio: ");
                            float raioC = scan.nextFloat();

                            FormaBid C = new Circulo(cor, id, x, y, raioC);

                            v[contador] = C;
                            contador++;
                            
                            break;
                            
                        case 2:

                            System.out.println("\nPontos(x, y): ");
                            x = scan.nextFloat();
                            y = scan.nextFloat();

                            System.out.println("\nLado: ");
                            float ladoQ = scan.nextFloat();
                            FormaBid Q = new Quadrado(cor, id, x, y, ladoQ);

                            v[contador] = Q;
                            contador++;
                            
                            break;
                            
                        case 3: 

                            System.out.println("\nPontos(x, y): ");
                            x = scan.nextFloat();
                            y = scan.nextFloat();

                            System.out.println("\nBase: ");
                            float base = scan.nextFloat();
                            
                            System.out.println("\nAltura: ");
                            float altura = scan.nextFloat();
                            
                            FormaBid T = new Triangulo(cor, id, x, y, base, altura);

                            v[contador] = T;
                            contador++;
                            
                            break;
                            
                        case 4: 

                            System.out.println("\nPontos(x, y, z): ");
                            x = scan.nextFloat();
                            y = scan.nextFloat();
                            z = scan.nextFloat();

                            System.out.println("\nRaio: ");
                            float raioE = scan.nextFloat();
                            
                            FormaTrid E = new Esfera(cor, id, x, y, z, raioE);
                            v[contador] = E;
                            contador++;
                            
                            break;
                            
                        case 5:

                            System.out.println("\nPontos(x, y, z): ");
                            x = scan.nextFloat();
                            y = scan.nextFloat();
                            z = scan.nextFloat();
                            
                            System.out.println("\nLado: ");
                            float ladoCb = scan.nextFloat();
                            
                            FormaTrid Cb = new Cubo(cor, id, x, y, z, ladoCb);

                            v[contador] = Cb;
                            contador++;
                            
                            break;
                            
                        case 6:

                            System.out.println("\nPontos(x, y, z): ");
                            x = scan.nextFloat();
                            y = scan.nextFloat();
                            z = scan.nextFloat();
                            
                            System.out.println("\nBase: ");
                            float B = scan.nextFloat();
                            
                            System.out.println("\nAltura: ");
                            float H = scan.nextFloat();
                            
                             System.out.println("\nAltura da Base: ");
                            float Hb = scan.nextFloat();
                            
                            FormaTrid Te = new Tetraedro(cor, id, x, y, z, B, H, Hb);

                            v[contador] = Te;
                            contador++;
                            
                            break;
                            
                        default:
                            System.out.println("\nOpcao invalida\n");
                            break;
                    } 
                    break;
                    
                case 2:
                    
                    System.out.println("\nFormas Cadastradas: \n");
                    
                    for(int i = 0; i < contador; i++){
                        
                        System.out.println(v[i].toString());
                    }
                    
                    break;
                case 3:
                    
                    System.out.println("\nArea das Formas Bidimensionais\n");
                    for(int i = 0; i < contador; i++){
                        if(v[i] instanceof FormaBid){
                            System.out.println(((FormaBid)v[i]).obterArea());
                        }
                    }
                    break;
                case 4:
                    
                    System.out.println("\nVolume das Formas Tridimensionais\n");
                    for(int i = 0; i < contador; i++){
                        if(v[i] instanceof FormaTrid){
                            System.out.println(((FormaTrid)v[i]).obterVolume());
                        }
                    }
                    break;
                case 5:
                    if (contador >= 2) {
                        for (int i = 0; i < contador; i++) {
                            if (v[i] instanceof Circulo || v[i] instanceof Esfera) {
                                for (int j = i + 1; j < contador; j++) {
                                    if (v[j] instanceof Circulo || v[i] instanceof Esfera ) {
                                        ((Circulo) v[i]).verificaIntercepcaoC((Circulo) v[j]);
                                        ((Esfera) v[i]).verificaIntercepcaoE((Esfera) v[j]);
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Encerrando atividade");
                    break; 
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
            
        } while(opcao != 6);
    }
    
}
