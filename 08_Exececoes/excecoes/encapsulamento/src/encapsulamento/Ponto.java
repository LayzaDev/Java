package encapsulamento;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ponto {
    
    private float X, Y;
    
    public void setPonto(float n1, float n2){
        X = n1 < 0 ? 0 : n1;
        Y = n2 < 0 ? 0 : n2;
    }
    
    public void setX(float valorX){
        X = valorX;
    }
    
    public void setY(float valorY){
        Y = valorY;
    }
    
    public float getX(){
        return X;
    }
    
    public float getY(){
        return Y;
    }
    
    public double calculaDistancia(Ponto p){
        float p1 = (X - p.X);
        float p2 = (Y - p.Y);
        return sqrt(pow(p1, 2) + pow(p2, 2)); 
    }
}
