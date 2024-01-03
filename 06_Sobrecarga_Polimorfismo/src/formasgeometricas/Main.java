package formasgeometricas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int opcao, contador = 0; 
        String cor;
        int x, y, z, raio;
        int b, h;
        
        Formas bid[] = new FormaBid[10];
        Formas trid[] = new FormaTrid[10];
        Formas v[] = new Formas[20];
        
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

                    switch(op){
                        case 1: 
                            
                            System.out.println("\nPontos(x, y): ");
                            x = scan.nextInt();
                            y = scan.nextInt();

                            System.out.println("\nRaio: ");
                            raio = scan.nextInt();

                            FormaBid C = new Circulo(contador, cor, x, y, raio);
                            v[contador] = C;
                            contador++;
                            
                            break;
                            
                        case 2:

                            System.out.println("\nPontos(x, y): ");
                            x = scan.nextInt();
                            y = scan.nextInt();

                            System.out.println("\nLado: ");
                            int ladoQ = scan.nextInt();
                            FormaBid Q = new Quadrado(contador, cor, x, y, ladoQ);

                            v[contador] = Q;
                            contador++;
                            
                            break;
                            
                        case 3: 

                            System.out.println("\nPontos(x, y): ");
                            x = scan.nextInt();
                            y = scan.nextInt();

                            System.out.println("\nBase: ");
                            b = scan.nextInt();
                            
                            System.out.println("\nAltura: ");
                            h = scan.nextInt();
                            
                            FormaBid T = new Triangulo(contador, cor, x, y, b, h);

                            v[contador] = T;
                            contador++;
                            
                            break;
                            
                        case 4: 

                            System.out.println("\nPontos(x, y, z): ");
                            x = scan.nextInt();
                            y = scan.nextInt();
                            z = scan.nextInt();

                            System.out.println("\nRaio: ");
                            raio = scan.nextInt();
                            
                            FormaTrid E = new Esfera(contador, cor, x, y, z, raio);
                            v[contador] = E;
                            contador++;
                            
                            break;
                            
                        case 5:

                            System.out.println("\nPontos(x, y, z): ");
                            x = scan.nextInt();
                            y = scan.nextInt();
                            z = scan.nextInt();
                            
                            System.out.println("\nLado: ");
                            int ladoCb = scan.nextInt();
                            
                            FormaTrid Cb = new Cubo(contador, cor, x, y, z, ladoCb);

                            v[contador] = Cb;
                            contador++;
                            
                            break;
                            
                        case 6:

                            System.out.println("\nPontos(x, y, z): ");
                            x = scan.nextInt();
                            y = scan.nextInt();
                            z = scan.nextInt();
                            
                            System.out.println("\nBase: ");
                            b = scan.nextInt();
                            
                            System.out.println("\nAltura: ");
                            h = scan.nextInt();
                            
                            FormaTrid t = new Tetraedro(contador, cor, x, y, z, b, h);

                            v[contador] = t;
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
                                        ((Circulo) v[i]).verificaIntercepcao((Circulo) v[j]);
                                        ((Esfera) v[i]).verificaIntercepcao((Esfera) v[j]);
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