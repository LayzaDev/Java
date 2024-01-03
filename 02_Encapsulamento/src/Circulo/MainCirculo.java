package Circulo;

import java.util.Scanner;

public class MainCirculo {
    public static void main(String a[]){
        Scanner ler = new Scanner(System.in);
        
        Circulo[] Circulos = new Circulo[10];
        
        int contador = 0, opcao;
       
        do{
            System.out.println("\nEscolha uma opcao:\n");
            System.out.println("1. Criar circulo");
            System.out.println("2. Mostrar circulos cadastrados");
            System.out.println("3. Sair");
            
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\nInforme o nome do circulo:\n");
                    String nome = ler.next();
                    System.out.println("\nInforme o raio do circulo:\n");
                    double raio = ler.nextDouble();
                    Circulo C = new Circulo(nome, raio, contador);
                    Circulos[contador] = C;
                    contador++;
                    break;
                case 2:
                    System.out.println("\nCirculos Cadastrados\n");
                    
                    System.out.println("==========================================");
                    for(int i = 0; i < contador; i++){
                        System.out.println(Circulos[i].toString());
                        System.out.println("==========================================");
                    }  
                   
                    break;  
                default:
                    System.out.println("Finalizando...");
                    break;
            }
        } while(opcao != 3);  
    }
}
