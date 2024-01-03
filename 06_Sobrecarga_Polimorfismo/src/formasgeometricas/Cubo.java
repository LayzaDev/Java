package formasgeometricas;

public class Cubo extends FormaTrid{
    
    private int lado;
    
    public Cubo(int id, String cor, int x, int y, int z, int lado){
        super(id, cor, x, y, z);
        this.lado = lado;
    }
    
    public int getLado(){
        return lado;
    }
    
    @Override
    public double obterVolume(){
        return lado * lado;
    }
    
    @Override
    public String toString(){
        return super.toString() 
                + ", lado: " + lado 
                + ", volume: " + obterVolume();
    }
}

