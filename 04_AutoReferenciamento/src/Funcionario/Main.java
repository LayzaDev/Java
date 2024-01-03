//Layza Nauane de Paula Silva - 12211BSI251
package Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        Funcionarios[] Func = new Funcionarios[10];
        
        int opcao, contador = 0;
        
        do{
            System.out.println("\nESCOLHA UMA OPCAO:\n");
            System.out.println("1. Cadastrar Funcionario");
            System.out.println("2. Pesquisar funcionário pelo CPF ou numero de matricula");
            System.out.println("3. Mostrar quantidade de funcionários por categoria");
            System.out.println("4. Mostrar o maior salario por categoria,");
            System.out.println("5. Monte a folha de pagamentos");
            System.out.println("6. Sair");
            
            opcao = scan.nextInt();
            switch(opcao){
                
                case 1:
                    
                    if(contador < Func.length){

                        System.out.println("\nEm qual categoria deseja cadastrar o funcionario:\n");
                        System.out.println("1. Funcionario Comissionado");
                        System.out.println("2. Funcionario Noturno");

                        int op = scan.nextInt();

                        System.out.println("\nNumero de Matricula: ");
                        int matricula = scan.nextInt();

                        System.out.println("\nNome: ");
                        String nome = scan.next();

                        System.out.println("\nCPF: ");
                        String cpf = scan.next();

                        System.out.println("\nIdade: ");
                        int idade = scan.nextInt();

                        if(op == 1){

                            System.out.println("\nNumero de vendas: ");
                            int numVendas = scan.nextInt();

                            Funcionarios Comissionado = new FuncionarioComissionado(matricula, nome, cpf, idade, numVendas);

                            System.out.println("\nEm qual posicao deseja cadastrar o funcionario?");
                            int posicao = scan.nextInt();
                            
                            
                            Func[posicao] = Comissionado;
                            
                            

                        } else if(op == 2){

                            int posicao = 0;
                            System.out.println("\nNoites trabalhadas: ");
                            int noitesTrabalhadas = scan.nextInt();

                            Funcionarios Noturno = new FuncionarioNoturno(matricula, nome, cpf, idade, noitesTrabalhadas);
                            
                            System.out.println("\nEm qual posicao deseja cadastrar o funcionario?");
                            posicao = scan.nextInt();
                            
                            
                            Func[posicao] = Noturno;
                            
                        }

                        contador++;
                    }
                    
                    break;
                case 2:
                    
                    System.out.println("Digite o CPF ou numero de matricula: ");
                    String pesquisa = scan.next();
                    
                    for(int i = 0; i < contador; i++){
                        if(Func[i].getCPF().equals(pesquisa) || Func[i].getMatricula() == Integer.parseInt(pesquisa)){
                            System.out.println("\n======= Funcionario encontrado =======");
                            System.out.println(Func[i].toString());
                        }
                    }
   
                    break;
                case 3:
                    System.out.println("\n======= FUNCIONARIOS CADASTRADOS POR CATEGORIA =======");
                    
                    int comissionados = 0, noturnos = 0;
                    
                    for(int i = 0; i < contador; i++){
                        if(Func[i] instanceof FuncionarioComissionado){
                            comissionados++;
                        } else if(Func[i] instanceof FuncionarioNoturno){
                            noturnos++;
                        }
                    }
                    
                    System.out.println("\nFuncionarios Comissionados: " + comissionados);
                    System.out.println("\nFuncionarios Noturnos: " + noturnos);
                    
                    break;
                    
                case 4:
                    float maiorSC = 0, maiorSN = 0;
                    
                    for(int i = 0; i < contador; i++){
                        
                        float salario = Func[i].calculaSalario();
                        
                        if ( Func[i] instanceof FuncionarioComissionado) {
                            if (salario > maiorSC) {
                                maiorSC = salario;
                            }
                        } else if (Func[i] instanceof FuncionarioNoturno) {
                            if (salario > maiorSN) {
                                maiorSN = salario;
                            }
                        }
                    }
                    
                    System.out.println("\nMaior Salario da categoria comissionado: " + maiorSC);
                    System.out.println("\nMaior salario da categoria noturno: " + maiorSN);
                    
                    break;
                case 5: 
                    
                    double total = 0.0;
                    
                    System.out.println("\nFOLHA DE PAGAMENTO");
                    
                    for(int i = 0; i < contador; i++){
                        
                        float salario = Func[i].calculaSalario();
                        total += salario;
                        
                        System.out.println("\n" + Func[i].toString());
                    }
                    
                    System.out.println("\nTOTAL A PAGAR: " + total);
                    
                    break;
                case 6:
                    System.out.println("\nEncerrando atividade...");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
                    break;   
            }
           
          
            
            
        } while(opcao != 6);
    }
}
