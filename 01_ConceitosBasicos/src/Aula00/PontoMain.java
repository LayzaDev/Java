// Layza Nauane - 12211BSI251

package Aula00;

import java.util.Scanner;

public class PontoMain {
    public static void main(String a[]){
        Scanner ler = new Scanner(System.in);
        
        Ponto A = new Ponto();
        Ponto B = new Ponto();
        
        System.out.println("Distancia Entre Dois Pontos\n");
        
        System.out.println("Informe os valores de Xa e Ya: ");
        A.x =  ler.nextInt();
        A.y =  ler.nextInt();
        
        A.SetValores(A.x, A.y);
        
        System.out.println("Informe os valores Xb e Yb: ");
        B.x = ler.nextInt();
        B.y = ler.nextInt();
        
        B.SetValores(B.x, B.y);
       
        System.out.println("Distancia: " + A.CalculaDistancia(B));
    } 
}
