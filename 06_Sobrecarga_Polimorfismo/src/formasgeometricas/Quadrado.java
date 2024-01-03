package formasgeometricas;

public class Quadrado extends FormaBid{
    
    private int lado;
    
    public Quadrado(int id, String cor, int x, int y, int lado){
        super(id, cor, x, y);
        this.lado = lado;
    }
    
    public int getLado(){
        return lado;
    }
    
    @Override
    public double obterArea(){
        return lado * lado;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Lado: " + lado;
    }
}
