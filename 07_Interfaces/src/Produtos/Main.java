package Produtos;

import java.util.Scanner;

public class Main {
    
    public static void main(String a[]){
    
        Scanner scan = new Scanner(System.in);

        Produtos p[] = new Produtos[10];
        
        int opcao, contador = 0;

        do{
            System.out.println("\n1. Adicionar produto");
            System.out.println("2. Calcular quantidade e preco dos produtos de uma categoria");
            System.out.println("3. Calcular total geral dos produtos já inseridos");
            System.out.println("4. Sair");
            
            opcao = scan.nextInt();
                    
            switch(opcao){
                case 1:
                    int escolha;
                    do{
                        System.out.println("\n1. Eletrodomestico");
                        System.out.println("2. Vinho");
                        System.out.println("3. Cafe");
                        System.out.println("4. Sair ");
                        escolha = scan.nextInt();
                        
                        System.out.println("\nAno de producao: ");
                        int ano = scan.nextInt();
                        System.out.println("Unidade de venda: ");
                        int uni = scan.nextInt();
                        System.out.println("Preco: ");
                        double preco = scan.nextDouble();
                        
                        if(escolha == 1){
                            Eletro e = new Eletro(ano, uni, "Eletrodomestico", preco); 
                            p[contador] = e;
                            contador++;
                        } else if(escolha == 2){
                            Vinho v = new Vinho(ano, uni, "Vinho", preco); 
                            p[contador] = v;
                            contador++;
                        } else if(escolha == 3){
                            Cafe c = new Cafe(ano, uni, "Cafe", preco); 
                            p[contador] = c;
                            contador++;
                        } else if(escolha == 4) {
                            System.out.println("\nSaindo...");
                        } else {
                            System.out.println("\nOpcao invalida!");
                        }
                    }while(escolha != 4);
                    
                    System.out.println("\n Produto adicionado com sucesso!");
                    break;
                case 2:
                    int cat;
                    do{
                        System.out.println("\nEscolha uma categoria: ");
                        System.out.println("1. Eletrodomestico");
                        System.out.println("2. Vinho");
                        System.out.println("3. Cafe");
                        System.out.println("4. Sair ");
                        cat = scan.nextInt();
                        
                        for(int i = 0; i < contador; i++){
                            
                        }
                    }while(cat != 4);
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nOpcao invalida!");
                    break;
            }
        } while(opcao != 5);
    }
}
