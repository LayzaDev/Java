package FormasGeometricas;

public class Triangulo extends FormaBid {
    
    private float base, altura;
    
    public Triangulo(String cor, int id, float x, float y, float B, float H){
        super(cor, id, x, y);
        this.base = B;
        this.altura = H;
    }
    
    public float getBase(){
        return base;
    }
    
    public float getAltura(){
        return altura;
    }
    
    @Override
    public double obterArea(){
        double area = base * altura;
        return area;
    }
    
    @Override
    public String toString(){
        String atual = super.toString();
        return atual + ", p(" + super.getX() + ", " + super.getY() + ")" + ", B: " + base + ", H: " + altura;
    }
    
    @Override
    public String mostraArea(){
        return "\nArea Circulo: " + obterArea();
    }
}

