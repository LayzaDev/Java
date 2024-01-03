package formasgeometricas;

public abstract class Formas {
    
    private int id;
    private String cor;
    
    public Formas(int id, String cor){
        this.id = id;
        this.cor = cor;
    }
    
    public int getId(){
        return id;
    }
    
    public String getCor(){
        return cor;
    }
    
    @Override
    public String toString(){
        return "\n" + id + " - " + cor + ", ";
    }
}
