// Layza Nauane de Paula Silva - 12211BSI251
package LojaComercial;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        Vendedor[] vendedores = new Vendedor[5];
        Administrador[] administradores = new Administrador[5];
        
        String nome, rg, cargo;
        float salario;
        
        int opcao = 0, opcao2 = 0, opcao3 = 0, opcao4 = 0, contador = 0;
        
        do{
            
            System.out.println("\nEscolha uma opcao:\n");
            System.out.println("1. Fazer login");
            System.out.println("2. Visualizar vendedores");
            System.out.println("3. VIsualizar administradores");
            System.out.println("4. Encerrar atividade");
            
            opcao = scan.nextInt();
            
            if(opcao == 1){
                System.out.println("\n============ DADOS DO FUNCIONARIO ============\n");
        
                System.out.println("Nome: ");
                nome = scan.next();

                System.out.println("\nRG: ");
                rg = scan.next();

                System.out.println("\nSalario: ");
                salario = scan.nextFloat();

                System.out.println("\nQual sua area de atuacao na loja?\n");
                System.out.println("1. Vendas");
                System.out.println("2. Administrativo");
                System.out.println("3. Encerrar atividade");

                opcao2 = scan.nextInt();
                
                if(opcao2 == 1){

                    if(contador < 5){
                        Vendedor V = new Vendedor(nome, rg, salario);
                        vendedores[contador] = V;
                        

                        do{
                            System.out.println("\n===============================================");
                            System.out.println("Escolha uma opcao:\n");
                            System.out.println("1. Registrar vendas");
                            System.out.println("2. Calcular/Visualizar salario a receber");
                            System.out.println("3. Visualizar total de vendas do mes");
                            System.out.println("4. Sair");

                            opcao3 = scan.nextInt();

                            switch(opcao3){
                                case 1: 
                                    System.out.println("\n===============================================");
                                    System.out.println("Quantas unidades foram vendidas? ");
                                    int unidades = scan.nextInt();
                                    System.out.println("\nQual o valor total arrecadado: ");
                                    float valor = scan.nextFloat();
                                    V.registrarVendas(valor, unidades);
                                    System.out.println("\nVendas registradas com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("\n===============================================\n");
                                     System.out.println("Voce deve receber neste mes o valor de " +  V.calcularSalario());
                                    
                                     break;
                                case 3:
                                    System.out.println("\n===============================================\n");
                                    System.out.println("Total de vendas do mes: " + V.getTotalVendas());
                                   
                                    break;
                                case 4: 
                                    System.out.println("\n===============================================\n");

                                    System.out.println("Encerrando atividade...");
                                    
                                    System.out.println("\n===============================================");

                                    break;
                                default:
                                    System.out.println("\n===============================================\n");

                                    System.out.println("\n Opcao Invalida \n"); 
                                    System.out.println("\n===============================================");
                                    break;
                            }
                            
                        } while(opcao3 != 4); 
                        
                        contador++;
                    }
                    
                } else if(opcao2 == 2){

                    if(contador < 5){

                        Administrador A = new Administrador(nome, rg, salario);

                        administradores[contador] = A;
                        
                        do{
                            System.out.println("\n===============================================");
                            System.out.println("Escolha uma opcao: \n");
                            System.out.println("1. Registrar horas extras");
                            System.out.println("2. Visualizar o total de horas extras do mes");
                            System.out.println("3. Calcular/Visualizar salario a receber");
                            System.out.println("4. Sair");

                            opcao4 = scan.nextInt();

                            switch(opcao4){
                                case 1: 
                                    System.out.println("\n===============================================");
                                    System.out.println("Informe a quantidade de horas extras que fez no mes");
                                    int totalHoras = scan.nextInt();
                                    A.registrarHorasExtras(totalHoras);
                                    System.out.println("\nHoras extras registradas com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("\n===============================================\n"); 
                                    System.out.println("Total de horas extras a receber: " + A.getHorasExtras());
                                    break;
                                case 3:
                                    System.out.println("\n===============================================\n");
                                    System.out.println("Voce deve receber neste mes o valor de " + A.calcularSalario());
                                    break;
                                case 4: 
                                    System.out.println("\n===============================================\n");
                                    System.out.println("Encerrando atividade...");
                                    System.out.println("\n===============================================");
                                    break;
                                default:
                                    System.out.println("\n===============================================\n");
                                    System.out.println("\nOpcao Invalida"); 
                                    System.out.println("\n===============================================\n");
                                    break;
                            }
                        }while(opcao4 != 4);
                        contador++;
                    }           
                } else if(opcao2 == 3){
                        
                    System.out.println("Finalizando...");
                    
                } else {
                    
                    System.out.println("Opcao invalida");    
                }
                            
            } else if(opcao == 2) {        
                        
                System.out.println("VENDEDORES");
                
                for(int i = 0; i < 5; i++){
                    System.out.println("\n" + vendedores[i].exibeVendedor() + "\n");
                }
                
            } else if(opcao == 3){
                
                for(int i = 0; i < 5; i++){
                    System.out.println("\n" + administradores[i].exibeAdm() + "\n");    
                }
            } 
        } while(opcao != 4); 
    }
}

