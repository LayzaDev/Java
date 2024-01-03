package funcionarios;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Funcionarios  func[] = new Funcionarios[5];
        
        func[0] = new Vendedor("Layza", "01", 10);
        func[1] = new Gerente("Fernando", "02");
        func[2] = new Assistente("Emanuel", "03");
        func[3] = new Vendedor("Yasmin", "04", 8);
        func[4] = new Gerente("Liz", "05");
        
        int opcao, contador = 0;

        do{
            System.out.println("\n1. Calcular valor total a pagar para os funcionarios");
            System.out.println("2. Calcular media salarial por categoria");
            System.out.println("3. Visualizar folha de pagamento por categoria");
            System.out.println("4. Sair");

            opcao = scan.nextInt();
                    
            switch(opcao){
                case 1:
                    
                    System.out.println("\n============= VALOR TOTAL ============\n");
                    
                    double salarios = 0, total = 0;
                    
                    for(int i = 0; i < 5; i++){
                        salarios = func[i].calculaSalario();
                        total += salarios;
                    }
                    
                    System.out.println("\nTotal: " + total);
                    
                    break;
                case 2:
                    
                    int contG = 0, contA = 0, contV = 0;
                    double salarioG, totalG = 0, salarioA, totalA = 0, salarioV, totalV = 0;
                    
                    for(int i = 0; i < 5; i++){
                        if(func[i] instanceof Gerente){
                            salarioG = func[i].calculaSalario();
                            totalG += salarioG;
                            contG++;
                        } else if(func[i] instanceof Assistente){
                            salarioA = func[i].calculaSalario();
                            totalA += salarioA;
                            contA++;
                        } else if(func[i] instanceof Vendedor){
                            salarioV = func[i].calculaSalario();
                            totalV += salarioV;
                            contV++;
                        }
                    }
                    
                    double mediaG = totalG/contG;
                    double mediaA = totalA/contA;
                    double mediaV = totalV/contV;
                    
                    System.out.println("\nMedia salarial dos gerentes: " + mediaG);
                    System.out.println("\nMedia salarial dos Assistentes: " + mediaA);
                    System.out.println("\nMedia salarial dos Vendedores: " + mediaV);
                    break;
                case 3:
                    
                    System.out.println("\n============ Folha de pagamento =============\n");
                    for(int i = 0; i < 5; i++){
                        if(func[i] instanceof Gerente || func[i] instanceof Assistente || func[i] instanceof  Vendedor){
                            System.out.println(func[i].mostraDados());
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpcao invalida!");
                    break;
            }
        } while(opcao != 5);
    }
}
