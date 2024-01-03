package Ponto;

import java.util.Scanner;

public class mainPonto {

    public static void main(String a[]) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o valor das Coordenadas Xa e Ya: ");
        double xa = ler.nextDouble();
        double ya = ler.nextDouble();
        
        Ponto pA = new Ponto(xa, ya);
        
        System.out.println("Informe o valor das Coordenadas Xb e Yb: ");
        double xb = ler.nextDouble();
        double yb = ler.nextDouble();
        
        Ponto pB = new Ponto(xb, yb);
       
        pA.calcularDistancia(pB);
        
        System.out.println("=========================================");
        System.out.println("A(" + xa + ", " + ya + ")");
        System.out.println("B(" + xb + ", " + yb + ")");
        System.out.println("Distancia: " + pA.calcularDistancia(pB));
        System.out.println("=========================================");
        
    }
}
