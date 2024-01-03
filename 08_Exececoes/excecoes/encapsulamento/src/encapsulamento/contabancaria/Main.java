package encapsulamento.contabancaria;

import java.util.Scanner;

public class Main {
    public static void main(String a[]) {
        
        Scanner ler = new Scanner(System.in);
        
        Cliente[] clientesCadastrados = new Cliente[10];
        
        while(true){
            System.out.println("Escolha uma das opcoes: ");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Autenticar cliente");
            
            int opcao = ler.nextInt();
            int contador = 0;

            String nome, cpf, telefone, usuario, senha;
            int idade;
       
            switch(opcao){
                case 1: 
                    Cliente cliente = new Cliente();
                    System.out.println("Informe o nome do cliente: ");
                    nome = ler.nextLine();

                    System.out.println("Informe o cpf do cliente: ");
                    cpf = ler.nextLine();

                    System.out.println("Informe o telefone do cliente: ");
                    telefone = ler.nextLine();

                    System.out.println("Informe o idade do cliente: ");
                    idade = ler.nextInt();

                    System.out.println("Informe o numero da conta: ");
                    int numeroConta = ler.nextInt();

                    System.out.println("Informe o saldo inicial da conta: ");
                    float saldoInicial = ler.nextFloat();

                    System.out.println("Informe o tipo da conta: ");
                    String tipoConta = ler.next();

                    Conta conta = new Conta();
                    conta.setConta(numeroConta, saldoInicial, tipoConta);

                    System.out.println("Informe o nome de usuario do cliente: ");
                    usuario = ler.next();

                    System.out.println("Informe a senha: ");
                    senha = ler.next();

                    cliente.cadastrarCliente(nome, cpf, telefone, idade, conta, senha);

                    clientesCadastrados[contador] = cliente;
                    
                    contador++;
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Entre com o CPF:");
                    String cpfUsuario = ler.next();
                    
                    System.out.println("Entre com a senha: ");
                    String senhaUsuario = ler.next();

                    for(int i = 0; i < contador; i++){
                        
                        if(cpfUsuario == clientesCadastrados[i].getCPF() && senhaUsuario == clientesCadastrados[i].getSenha()){

                            Cliente clienteLogado = clientesCadastrados[i];

                            System.out.println("\nEscolha uma opcao:\n");
                            System.out.println("1. Sacar dinheiro");
                            System.out.println("2. Depositar dinheiro");
                            System.out.println("3. Visualizar saldo");
                            System.out.println("4. Transferir dinheiro");
                            System.out.println("5. Relatório cliente");
                            System.out.println("6. Clientes negativados");
                            System.out.println("7. Sair");

                            int opcao2 = ler.nextInt();

                            switch(opcao2){
                                case 1: 
                                    System.out.println("Informe o valor a ser sacado: ");
                                    float valor= ler.nextFloat();

                                    clienteLogado.getConta().sacar(valor);
                                    System.out.println("Saque realizado com sucesso!");

                                    break;
                                case 2: 

                                    System.out.println("Informe o valor a ser depositado: ");
                                    float valorDep = ler.nextFloat();

                                    clienteLogado.getConta().depositar(valorDep);

                                    System.out.println("Deposito realizado com sucesso!"); 
                                    break;

                                case 3: 

                                    System.out.println("Saldo disponivel: " + clienteLogado.getConta().mostraSaldo());
                                    break;

                                case 4:

                                    System.out.println("Informe o numero da conta que voce quer depositar: ");
                                    int numContaDestino = ler.nextInt();

                                    System.out.println("Informe o valor a ser transferido: ");
                                    float valorATransferir = ler.nextFloat();

                                    for(int j = 0; j < contador; j++){

                                        if(numContaDestino == clientesCadastrados[j].getConta().getId()){

                                           clienteLogado.getConta().transferencia(clientesCadastrados[j].getConta(), valorATransferir);
                                        }
                                    }
                                    break;

                                case 5:
                                    System.out.println(clienteLogado.toString());
                                    break;
                                case 6:
/*
                                    System.out.println("========Clientes Negativados========");

                                    for(int k = 0; k < contador; k++){

                                        if(clientesCadastrados[i].getConta().mostraSaldo() < 0){

                                            System.out.println(clienteLogado.clientesNegativados());
                                        }
                                    }*/
                                    break;
                                default:
                                    System.out.println("Finalizando..."); 
                                    break;   
                            }
                        }
                    } 
                default:
                    System.out.println("Opcao invalida");
            }
        }
        
    }
}