package formasgeometricas;

import static java.lang.Math.sqrt;

public class Esfera extends FormaTrid{
    private int raio;
    
    public Esfera(int id, String cor, int x, int y, int z, int raio){
        super(id, cor, x, y, z);
        this.raio = raio;
    }
    
    public int getRaio(){
        return raio;
    }
    
    public String verificaIntercepcao(Esfera e){
        double px = (this.getX() - e.getX());
        double py = (this.getY() - e.getY());
        double pz = (this.getZ() - e.getZ());
        double dist = sqrt((px*px) + (py*py) + (pz*pz));
        double somaRaios = this.getRaio() + e.getRaio();
        
        if(dist == somaRaios){
            return "Se interceptam";
        } else if(dist > somaRaios){
            return "Fora da esfera";
        } else {
            return "Não se interceptam";
        }
    }
    
    @Override
    public double obterVolume(){
        return (4/3) * Math.PI * Math.pow(raio, 3);
    } 
    
    @Override 
    public String toString(){
        return super.toString()
                + ", raio: " + raio
                + ", volume: " + obterVolume();
    }
}

