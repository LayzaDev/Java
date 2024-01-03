package FormasGeometricas;

public class Quadrado extends FormaBid{
    
    private float lado;
    
    public Quadrado(String cor, int id, float x, float y, float lado){
        super(cor, id, x, y);
        this.lado = lado;
    }
    
    public float getLado(){
        return lado;
    }
    
    @Override
    public double obterArea(){
        double area = lado * lado;
        return area;
    }
    
    @Override
    public String toString(){
        String atual = super.toString();
        return atual + ", p(" + super.getX() + ", " + super.getY() + ")" + ", L: " + lado + ", A: " + obterArea();
    }
    
    @Override
    public String mostraArea(){
        return "\nArea Quadrado " + obterArea();
    }
}
