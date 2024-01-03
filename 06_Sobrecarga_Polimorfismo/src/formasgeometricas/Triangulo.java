package formasgeometricas;

public class Triangulo extends FormaBid{
    
    private int base, altura;
    
    public Triangulo(int id, String cor, int x, int y, int b, int h){
        super(id, cor, x, y);
        this.base = b;
        this.altura = h;
    }
    
    public int getBase(){
        return base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    @Override
    public double obterArea(){
        return base * altura;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", base: " + base + ", altura: " + altura;
    }
}
