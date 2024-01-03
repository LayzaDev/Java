package preenchevetor;

import java.util.Scanner;

public class PreencheVetor {

    public static void main(String[] args) {
       
        int[] vetor = new int[10];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            System.out.println("Insira um numero (ou -1 para parar)");
            String num = scan.nextLine();
            
            if(num.equals("-1")){
                break;
            }
            
            try{
                int valor = Integer.parseInt(num);
                
                System.out.println("\nInforme a posicao do vetor de 0 a 9: ");
                int posicao = Integer.parseInt(scan.nextLine());
                
                if(posicao < 0 || posicao >= 10){
                    System.out.println("\nErro: posicao invalida, deve ser informado valores de 0 a 9");
                    i--;
                } else {
                    vetor[posicao] = valor;
                }
            } catch(NumberFormatException e){
                System.out.println("\nErro: Entrada não numerica tente novamente");
                i--;
            } catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("\nErro: Posicao inexistente, tente novamente");
                i--;
            }
        }
        System.out.println("\nVetor Preenchido\n");
        for(int valor : vetor){
            System.out.println(valor + "");
        }
    }
}
