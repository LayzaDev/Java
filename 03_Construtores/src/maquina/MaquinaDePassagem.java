package maquina;

public class MaquinaDePassagem {
    
    float preco, qtdInserida, total;
    
    public MaquinaDePassagem(float preco){
        this.preco = preco;
        this.qtdInserida = 0;
        this.total = 0;
    }
        
    public float getPreco(){
        return preco;
    }
    
    public float getQtdInserida(){
        return qtdInserida;
    }
    
    public float getTotal(){
        return total;
    }
    
    public void inserirDinheiro(float valor){
        if(valor >= 1 || valor <= 2){
           this.qtdInserida += valor;
           this.total += valor;
        } else {
            System.out.println("\n***********************************************************\n");
            System.out.println("       A maquina aceita apenas notas de 1,00 ou 2,00.");
            System.out.println("\n***********************************************************\n");
        }
    }
    
    public String emitirPassagem(){
        return "\n============================= PASSAGEM =============================\n"
                +"             Preco do ticket: " + getPreco()
                +"\n====================================================================\n";   
    }
    
    public String mostraPrecoPassagem(){
        return "\nPreco da passagem: " + getPreco();
    }
    
    public float getRetornaTroco(){
        float valor = qtdInserida;
        valor -= preco;
        total -= valor;
        return valor;
    }
}
