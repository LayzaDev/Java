package FormasGeometricas;

public abstract class Forma {
    
    private String cor;
    private int id;
  
    public Forma(String cor, int id){
        this.cor = cor;
        this.id = id;
    }
    
    public String getCor(){
        return cor;
    }
    
    public int getId(){
        return id;
    }
    
    @Override
    public String toString(){
        return "\nForma " + getId() + ": " + getCor();
    }
}
