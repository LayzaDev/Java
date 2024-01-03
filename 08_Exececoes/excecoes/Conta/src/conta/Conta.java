package conta;

public class Conta {
    String nome;
    double saldo;
    int numero;
    
    public Conta(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        this.saldo = 100;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        try{
            if(valor > 0 && valor < saldo){
                saldo -= valor;
                System.out.println("\nSaque realizado no valor de R$" + valor + " reais");
            } else {
                throw new  IllegalArgumentException("\nErro: Saldo insuficiente");
            }
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void depositar(double valor){
        try{
            if(valor > 0){
                saldo += valor;
                System.out.println("\nDeposito realizado com sucesso!");
            } else {
                throw new IllegalArgumentException("\nErro: Valor de deposito negativo");  
            }
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void visualizarSaldo(){
        System.out.println("Nome: " + nome + "\nSaldo: " + saldo);
    }
}
