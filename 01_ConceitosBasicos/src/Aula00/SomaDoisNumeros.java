// Layza Nauane - 12211BSI251

package Aula00;

import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String a[]){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        float numero1 = ler.nextFloat();
        
        System.out.println("Informe o segundo numero: ");
        float numero2 = ler.nextFloat();
        
        float soma = numero1 + numero2;
   
        System.out.println("Resultado: " + soma);
    }
}
