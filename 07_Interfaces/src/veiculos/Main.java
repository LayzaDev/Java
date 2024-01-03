package veiculos;

import java.util.Scanner;

public class Main {
    public static void main(String a[]){
        
        Scanner scan = new Scanner(System.in);

        Veiculos  veic[] = new Veiculos[5];
        
        veic[0] = new Carro("Toyota", "Camry", "Prata", 200);
        veic[1] = new Caminhonete("Chevrolet", "Silverado", "Vermelho", 350);
        veic[2] = new Carro("Honda", "Civic", "Vermelho", 180);
        veic[3] = new Carro("Ford", "Mustang", "Vermelho", 450);
        veic[4] = new Caminhonete("Ford", "F-150", "Branco", 400);
        
        String marcaMaiorPot = "", marcaMenorPot = "";
        String cor = "Vermelho";
        int maiorPot = -1, menorPot = -1;
        
        for(int i = 0; i < 5; i++){
            if(cor.equals(veic[i].getCor())){
                if(maiorPot < veic[i].getPotencia()){
                    maiorPot = veic[i].getPotencia();
                    marcaMaiorPot = veic[i].getMarca();
                } else if (menorPot > veic[i].getPotencia()){
                    menorPot = veic[i].getPotencia();
                    marcaMenorPot = veic[i].getMarca();
                }
            }
        }

        System.out.println("\nO veículo de maior potencia é da " + marcaMaiorPot + " com " + maiorPot + " cavalos.");
        for(int i = 0; i < 5; i++){
            if(maiorPot == veic[i].getPotencia()){
                System.out.println(veic[i].mostraDados());
            }
        }
        
        System.out.println("\nO veículo de menor potencia é da " + marcaMenorPot + " com " + menorPot + " cavalos.");
        for(int i = 0; i < 5; i++){
            if(menorPot == veic[i].getPotencia()){
                System.out.println(veic[i].mostraDados());
            }
        }
    }
}
