// Layza Nauane - 12211BSI251

package Aula00;

import java.util.Scanner;

public class ClienteMain {
    public static void main(String a[]){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Area de Cadastro\n");
        
        System.out.println("Informe o nome do cliente: ");
        String nome = ler.next();
        
        System.out.println("Informe o CPF do cliente: ");
        String cpf = ler.next();
        
        System.out.println("Informe a idade do cliente: ");
        int idade = ler.nextInt();
        
        System.out.println("Informe o telefone do cliente: ");
        String telefone = ler.next();
        
        Cliente C = new Cliente();
        
        C.setCadastrarCliente(nome, cpf, idade, telefone);
        
        System.out.println("-----------------------------------");
        
        C.getMostrarDadosCliente();  
    }
}
