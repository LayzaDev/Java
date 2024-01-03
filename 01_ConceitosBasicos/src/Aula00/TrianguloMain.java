// Layza Nauane - 12211BSI251

package Aula00;

import java.util.Scanner;

public class TrianguloMain {

    public static void main(String a[]) {
        
        Triangulo[] triangulosCadastrados = new Triangulo[10];

        Scanner ler = new Scanner(System.in);
        
        int contador = 0, opcao;
       
        do{
            System.out.println("\nEscolha uma opcao:\n");
            System.out.println("1. Inserir triangulo");
            System.out.println("2. Mostrar triangulos cadastrados");
            System.out.println("3. Mostrar o numero de triangulos equilateros");
            System.out.println("4. Mostrar o triangulo cadastrado com o maior perimetro\n");
            
            opcao = ler.nextInt();
            
            if(opcao == 1){ 
                
                Triangulo T = new Triangulo();
                
                System.out.println("\nInforme o valor dos lados do triangulo:\n");
                int lado1 = ler.nextInt();
                int lado2 = ler.nextInt();
                int lado3 = ler.nextInt();
                
                T.setLadosTriangulo(lado1, lado2, lado3, contador);
                
                triangulosCadastrados[contador] = T;
                
                contador++;
                
            } else if(opcao == 2){
                
                System.out.println("\nTriangulos Cadastrados\n");
                
                for(int i = 0; i < contador; i++){
                    
                   System.out.println(triangulosCadastrados[i].toString());
                   
                }   
                
            } else if(opcao == 3){
                
                int numeroDeEquilateros = 0;
                
                for(int i = 0; i < contador; i++){
                    
                    String tipo = triangulosCadastrados[i].getDefinirTipoTriangulo();
                   
                    if("Equilatero".equals(tipo)){
                        
                       numeroDeEquilateros++;
                    }
                }
                
                System.out.println("\nNumero de triangulos equilateros cadastrados: " + numeroDeEquilateros);
                
            } else if(opcao == 4){ 
             
                int perimetro = -1, maiorPerimetro = -1;
              
                for(int i = 0; i < contador; i++){
                    
                    maiorPerimetro = triangulosCadastrados[i].calcularPerimetro();
                    
                    if(maiorPerimetro < perimetro){
                        
                        maiorPerimetro = perimetro; 
                        
                    }
                }
                
                for(int i = 0; i < contador; i++){
                    
                    if(maiorPerimetro == triangulosCadastrados[i].calcularPerimetro()){
                        
                        int maior = triangulosCadastrados[i].calcularPerimetro();
                        
                        System.out.println("\nTriangulo com maior perimetro:\n");
                        System.out.println(triangulosCadastrados[i] + "Perimetro: " + maior);
                    }
                }
            } else {
                
                System.out.println("\nERRO: Opcao Invalida!");
                
            }
        } while(true);
    }    
}