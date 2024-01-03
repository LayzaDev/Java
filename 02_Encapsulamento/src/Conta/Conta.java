package Conta;

public class Conta {
    
    private int numero; 
    private float saldo;
    private String tipo;
    
    public void cadastraConta(int num,float saldo,String tipo){
        this.numero = num;
    
        if (saldo >= 100) {
            this.saldo = saldo;
        } else {
            this.saldo = 100;
            this.tipo = tipo;
        }
    } 
        
    public boolean sacar(float valor){
        if (valor <= (saldo+100)) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(float valor) {
        saldo += valor;
    }
    
    public float getVisualizarSaldo(){
        return saldo;
    }
    
    public void transferirDinheiro(Conta contaDestino, float valor){
        contaDestino.depositar(valor);
    }
    
    public int getNumeroConta(){
        return numero;
    }
}

