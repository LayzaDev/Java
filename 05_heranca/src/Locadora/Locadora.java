package Locadora;

public class Locadora {
    
    private String nome, tipo, genero;
    private double preco;
    
    public Locadora(String nome, String tipo, String genero, double preco){
        
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.preco = preco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public double getPreco(){
        return preco;
    }
    
    @Override
    public String toString(){
        return "\nNome: " + nome + ", Tipo: " + tipo + ", Genero: " + genero + ", Preco: " + preco;
    }
}
