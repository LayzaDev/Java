package Produtos;

public class Cafe implements Produtos{
    private int id, ano, uniVenda;
    private String categoria;
    private double preco;
    
    public Cafe(int ano,int uniVenda, String cat, double preco){
       setID(3);
       setAnoProducao(ano);
       setUnidVenda(uniVenda);
       setCategoria(cat);
       setPreco(preco);
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    @Override
    public int getID(){
        return id;
    }
    
    public void setAnoProducao(int ano){
        this.ano = ano;
    }
    
    @Override
    public int getAnoProducao(){
        return ano;
    }
    
    public void setUnidVenda(int uni){
        this.uniVenda = uni;
    }
    
    @Override
    public int getUnidVenda(){
        return uniVenda;
    }
    
    public void setCategoria(String cat){
        this.categoria = cat;
    }
    
    @Override
    public String getCategoria(){
        return categoria;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }
    
    @Override
    public String mostraDados(){
        return "\n" + id 
                + " - " + categoria 
                + ", " + ano 
                + ", " + uniVenda 
                + ", " + preco;
    }
}
