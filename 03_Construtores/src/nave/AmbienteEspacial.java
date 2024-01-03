package nave;

import java.util.Scanner;

public class AmbienteEspacial {
    public static void main(String a[]){
        
        Scanner scan = new Scanner(System.in);
        
        NaveEspacial naves[] = new NaveEspacial[5];
        int opcao, contador = 0;
        
        do{
            System.out.println("\n1. Criar nova maquina");
            System.out.println("2. Exibir naves existentes");
            System.out.println("3. Parar nave");
            System.out.println("4. Ligar nave");
            System.out.println("5. Encerrando");
            
            opcao = scan.nextInt();
            String nome;
            
            switch(opcao){
                case 1:
                    System.out.println("\nNomeie sua Nave: ");
                    nome = scan.next();
                    
                    NaveEspacial nave = new NaveEspacial(nome);
                    naves[contador] = nave;
                    contador++;
                    break;
                case 2:
                    for(int i = 0; i < contador; i++){
                        if(naves[i].getVelocidade() == 0){
                            System.out.println(naves[i].mostrarNave());
                            System.out.println("\nNave Inoperante");
                        } else {
                            System.out.println(naves[i].mostrarNave());
                        }
                    }
                    break;
                case 3:
                    
                    for(int i = 0; i < contador; i++){
                        if(naves[i].getVelocidade() != 0){
                            System.out.println(naves[i].mostrarNave());
                        }
                    }
                    
                    System.out.println("\nInsira o nome da nave que deseja parar:");
                    nome = scan.next();
                    
                    for(int i = 0; i < contador; i++){
                        if(naves[i].getNome().equals(nome)){
                            naves[i].setVelocidade(0);
                        }
                    }
                    
                    break;
                case 4:
                    
                    int navesOperantes = 0;
                    for(int i = 0; i < contador; i++){
                        if(naves[i].getVelocidade() != 0){
                            navesOperantes++;
                        }
                    }
                    
                    if(navesOperantes > 3){
                        System.out.println("\nSuperlotacao de Naves\n");
                        break;
                    } else {
                        for(int i = 0; i < contador; i++){
                            if(naves[i].getVelocidade() == 0){
                                System.out.println(naves[i].mostrarNave());
                            }
                        }
                    
                        System.out.println("\nInsira o nome da nave que deseja ligar: ");
                        nome = scan.next();
                        System.out.println("\nDefina a velocidade com a qual ela será iniciada: ");
                        int v = scan.nextInt();
                        
                        for(int i = 0; i < contador; i++){
                            if(naves[i].getNome().equals(nome)){
                                naves[i].setVelocidade(v);
                            }
                        }
                    }
                break;
                case 5:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpcao Invalida...");
                    break;
            }
            
        }while(opcao != 5);
    }
}
