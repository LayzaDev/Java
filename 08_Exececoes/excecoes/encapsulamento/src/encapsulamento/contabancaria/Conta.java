package encapsulamento.contabancaria;

import encapsulamento.contabancaria.Cliente;

public class Conta {
    
    private float saldo;
    private String tipoDeConta;
    private String senha;
    private int id;
    
    public void setConta(int numConta, float saldo, String tipo){
        this.saldo = saldo >= 100 ? saldo : 100;
        this.id = numConta;
        if(tipo.equals("Corrente") || tipo.equals("Poupanca")){
            this.tipoDeConta = tipo;
        }
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public int getId(){
        return id;
    }
    
    public String tipoDeConta(){
        return tipoDeConta;
    }
    
    public String mostraSaldo(){
        return "Saldo disponivel na conta " + id + ": " + saldo;
    }
  
    public boolean sacar(float valor){
        if(valor < (saldo + 100)){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public void depositar(float valor){
        this.saldo += valor;
    }
    
    public boolean transferencia(Conta c1, float valor){
        if(valor > 0){
            c1.depositar(valor);
            return true;
        } 
        return false;
    }
}
