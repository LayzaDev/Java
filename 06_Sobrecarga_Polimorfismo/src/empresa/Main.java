package empresa;

import java.util.Scanner;

public class Main {
    
    public static void main(String a[]){
    
        Scanner scan = new Scanner(System.in);

        int opcao, contador = 0;

        Funcionarios func[] = new Funcionarios[10];

        do{
            System.out.println("\n1. Cadastrar funcionario");
            System.out.println("2. Pesquisar funcionario por cpf");
            System.out.println("3. Pesquisar funcionario por matricula");
            System.out.println("4. Funcionarios cadastrados por categoria");
            System.out.println("5. Visualizar maior salario por categoria");
            System.out.println("6. Visualizar folha de pagamento");
            System.out.println("7. Encerrar");
            
            opcao = scan.nextInt();
                    
            switch(opcao){
                
                case 1:
                    int op;
                    do{
                        System.out.println("\nEscolha uma opcao: ");
                        System.out.println("1. Funcionario comissionado");
                        System.out.println("2. Funcionario noturno");
                        System.out.println("3. Encerrar");
                        
                        op = scan.nextInt();
                        
                        
                        
                        
                        if(op == 1){
                            System.out.println("\nMatricula: ");
                            int mat = scan.nextInt();

                            System.out.println("Nome: ");
                            String nome = scan.nextLine();
                            scan.nextLine();

                            System.out.println("Idade: ");
                            int idade = scan.nextInt();

                            System.out.println("CPF: ");
                            String cpf = scan.next();
                                
                            System.out.println("Numero de vendas no mes: ");
                            int num = scan.nextInt();
                            
                            Comissionado c = new Comissionado(mat, nome, idade, cpf, num);
                            func[contador] = c;
                            contador++;
                        } else if(op == 2){
                            System.out.println("\nMatricula: ");
                            int mat = scan.nextInt();

                            System.out.println("Nome: ");
                            String nome = scan.nextLine();
                            scan.nextLine();

                            System.out.println("Idade: ");
                            int idade = scan.nextInt();

                            System.out.println("CPF: ");
                            String cpf = scan.next();
                                
                            System.out.println("Numero de noites trabalhadas no mes: ");
                            int num = scan.nextInt();
                            
                            Noturno n = new Noturno(mat, nome, idade, cpf, num);
                            func[contador] = n;
                            contador++;
                        } else if(op == 3){
                            System.out.println("\nEncerrando cadastros...");
                        } else {
                            System.out.println("\nOpcao invalida!");
                        }
                    }while(op != 3);
                    break;
                case 2:
                    
                    System.out.println("Informe o CPF: ");
                    String cpf = scan.next();
                    for(int i = 0; i < contador; i++){
                        if(cpf.equals(func[i].getCPF())){
                            System.out.println(func[i].mostraFolhaPagamento());
                        }
                    }
                  
                    break;
                case 3:
                    System.out.println("Informe o numero de matricula: ");
                    int matricula = scan.nextInt();

                    for(int i = 0; i < contador; i++){
                        if(matricula == func[i].getMat()){
                            System.out.println(func[i].mostraFolhaPagamento());
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n=================== Comissionados ===================\n");
                    for(int i = 0; i < contador; i++){
                        if(func[i] instanceof Comissionado){
                            System.out.println(func[i].mostraDados());
                        }
                    }
                    System.out.println("\n=================== Noturnos ===================\n");
                    for(int i = 0; i < contador; i++){
                        if(func[i] instanceof Noturno){
                            System.out.println(func[i].mostraDados());
                        }
                    }
                    break;
                case 5:
                    System.out.println("\n===================== Maior Salario =======================\n");
                    
                    double maiorSalarioComis = -1;
                    double maiorSalarioNotur = -1;
                    
                    for(int i = 0; i < contador; i++){
                        if(func[i] instanceof Comissionado){
                            if(maiorSalarioComis < func[i].calculaSalarioMensal()){
                                maiorSalarioComis = func[i].calculaSalarioMensal();
                            }
                        } else if(func[i] instanceof Noturno){
                            if(maiorSalarioNotur < func[i].calculaSalarioMensal()){
                                maiorSalarioNotur = func[i].calculaSalarioMensal();
                            }
                        }
                    }
                    
                    System.out.println("Comissionado: " + maiorSalarioComis);
                    System.out.println("Noturno: " + maiorSalarioNotur);
                    break;
                case 6:
                    for(int i = 0; i < contador; i++){
                        if(func[i] instanceof Comissionado){
                            System.out.println(func[i].mostraFolhaPagamento());
                        } else if(func[i] instanceof Noturno){
                            System.out.println(func[i].mostraFolhaPagamento());
                        }
                    }
                    break;
                case 7:
                    System.out.println("\nEncerrando atividade...");
                    break;
                default:
                    System.out.println("\nOpcao invalida!");
                    break;
            }
        } while(opcao != 7);
    }
}
