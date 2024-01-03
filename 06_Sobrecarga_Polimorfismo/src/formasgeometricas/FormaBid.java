package formasgeometricas;

public abstract class FormaBid extends Formas {
    
    private int x, y;
    
    public FormaBid(int id, String cor, int x, int y){
        super(id, cor);
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public abstract double obterArea();
    
    @Override
    public String toString(){
        return super.toString() 
                + "p(" + x + ", " + y + ")";
    }
}
