package encapsulamento.contabancaria;

import encapsulamento.contabancaria.Conta;

public class Cliente {
    
    private String nome, cpf, telefone, senha;
    private Conta conta;
    private int idade;
    
    public void cadastrarCliente(String nome, String cpf, String telefone, int idade, Conta conta, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.conta = conta;
        this.senha = senha;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public Conta getConta(){
        return conta;
    }
    
    public String getSenha(){
        return senha;
    }
    
    @Override
    public String toString(){
        return "\n=================== DADOS DO CLIENTE ======================\n"
                + "\nCliente: " + nome 
                + "\nCPF: " + cpf 
                + "\nIdade: " + idade + "anos, " 
                + "\nTelefone: " + telefone
                + "\nNumero da conta: " + conta.getId()
                + "\nTipo da conta: " + conta.tipoDeConta()
                + "\n===========================================================";
    }
}
