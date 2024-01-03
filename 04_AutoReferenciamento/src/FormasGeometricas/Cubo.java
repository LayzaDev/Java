package FormasGeometricas;

public class Cubo extends FormaTrid{
    
    private float lado;
    
    public Cubo(String cor, int id, float x, float y, float z, float lado){
        super(cor, id, x, y, z);
        this.lado = lado;
    }
    
    public float getLado(){
        return lado;
    }
    
    @Override
    public double obterVolume(){
        double volume = lado * lado * lado;
        return volume;
    }
    
    @Override
    public String toString(){
        String atual = super.toString();
        return atual + ", p(" + super.getX() + ", " + super.getY() + ", " + super.getZ() + "), L: " + lado + ", Volume: " + obterVolume();
    }
}
