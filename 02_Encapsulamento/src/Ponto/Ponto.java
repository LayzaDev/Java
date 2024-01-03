package Ponto;

public class Ponto {
    private double x;
    private double y;
  
    public Ponto(double num1, double num2){
        x = num1 < 0 ? 0 : num1;
        y = num2 < 0 ? 0 : num2;
    }
    
    public void setAlterarValorDeX(double valorX){
       x = valorX;
    } 
    
    public void setAlterarValorDeY(double valorY){
       y = valorY;
    }
    
    public double getRetornarX(){
       return x;
    } 
    
    public double getRetornarY(){
        return y;
    }
    
    public double calcularDistancia(Ponto p){
        return Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y)));
    }
}
