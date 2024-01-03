package Conta;

import Conta.Conta;

public class Cliente {
   
    private String nome, cpf, telefone;
    private int idade;
    private Conta conta;
    private String usuario, senha;
    
    public void cadastraCliente(String nome,String cpf,String telefone,int idade,Conta conta,String usuario,String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.conta = conta;
        this.usuario = usuario;
        this.senha = senha;
        System.out.println("Cliente cadastrado!");
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public Conta getConta(){
        return conta;
    }
    
    public String dadosCliente(){
        return "Numero da conta: " + getConta().getNumeroConta() + "\nNome do cliente: " + getNome() + "\nSaldo: " + getConta().getVisualizarSaldo();
    }
    
    public String clientesNegativados(){
        return "Cliente: " + getNome() + "\nNumero da conta: " + getConta().getNumeroConta() + "\nSaldo: " + getConta().getVisualizarSaldo();
    }
} 

