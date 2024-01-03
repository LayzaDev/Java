package FormasGeometricas;

public class Circulo extends FormaBid{
    float raio;
    
    public Circulo(String cor, int id, float x, float y, float raio){
        super(cor, id, x, y);
        this.raio = raio;
    }
        
    public float getRaio(){
        return raio;
    }
    
    @Override
    public double obterArea() {
        double area = 3.14 * raio*raio;
        return area;
    }
    
    public void verificaIntercepcaoC(Circulo C){
        float xA = this.getX();
        float xB = C.getX();
        
        float yA = this.getY();
        float yB = C.getY();
        
        float X = xB - xA;
        float Y = yB - yA;
        
        double D = Math.pow(X, 2) + Math.pow(Y, 2);
        
        float somaRaios = getRaio() + C.getRaio();
        
        if(D < somaRaios){
            System.out.println("Os circulos se interceptam");
        } else {
            System.out.println("Os circulos não se interceptam");
        }
    }
    
    @Override
    public String toString(){
        String atual = super.toString();
        return atual + ", p(" + super.getX() + ", " + super.getY() + ")" + ", R: " + getRaio();
    }
    
    @Override
    public String mostraArea(){
        return "\nArea Circulo: " + obterArea();
    }
}
    
