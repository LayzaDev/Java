package FormasGeometricas;

public abstract class FormaBid extends Forma{
    private float x, y;
   
    public FormaBid(String cor, int id, float x, float y){
        super(cor, id);
        this.x = x;
        this.y = y;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public abstract double obterArea();
    
    public abstract String mostraArea();
}
