package FormasGeometricas;

public class Esfera extends FormaTrid{
    
    private float raio;
    
    public Esfera(String cor, int id, float x, float y, float z, float raio){
        super(cor, id, x, y, z);
        this.raio = raio;
    }
    
    public float getRaio(){
        return raio;
    }
    
    public void verificaIntercepcaoE(Esfera E){
        double xA = this.getX();
        double xB = E.getX();
        
        double yA = this.getY();
        double yB = E.getY();
        
        double zA = this.getZ();
        double zB = E.getZ();
        
        double X = xB - xA;
        double Y = yB - yA;
        double Z = zB - zA;
        
        double D = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2) + Math.pow(Z, 2));
        
        float somaRaios = getRaio() + E.getRaio();
        
        if(D < somaRaios){
            System.out.println("As esferas se interceptam");
        } else {
            System.out.println("Os esferas não se interceptam");
        } 
    }
    
    @Override
    public double obterVolume(){
        double volume = (4/3) * 3.14 * Math.pow(raio, 3);
        return volume;
    }
    
    @Override
    public String toString(){
        String atual = super.toString();
        return atual + ", p(" + super.getX() + ", " + super.getY() + ", " + super.getZ() + "), R: " + raio + ", Volume: " + obterVolume();
    }
}
