package formasgeometricas;

import static java.lang.Math.sqrt;

public class Circulo extends FormaBid{
    private int raio;
    
    public Circulo(int id, String cor, int x, int y, int raio){
        super(id, cor, x, y);
        this.raio = raio;
    }
    
    public int getRaio(){
        return raio;
    }
    
    public String verificaIntercepcao(Circulo c){
        double px = (this.getX() - c.getX());
        double py = (this.getY() - c.getY());
        double dist = sqrt((px * px) + (py * py));
        double raios = (Math.pow(this.getRaio() + c.getRaio(), 2));
        if(dist == raios){
            return "Se interceptam";
        } else if (dist > raios){
            return "Fora da circunferencia"; 
        } else {
            return "Não se interceptam";
        }
    }
    
    @Override
    public double obterArea(){
        return Math.PI * (raio * raio);
    }
    
    @Override
    public String toString(){
        return super.toString() 
                + ", raio: " + raio
                + ", area: " + obterArea();
    } 
}
