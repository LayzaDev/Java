package FormasGeometricas;

public class Tetraedro extends FormaTrid{
    
    float base, altura, alturaBase;
    
    public Tetraedro(String cor, int id, float x, float y, float z, float base, float altura, float alturaBase){
        super(cor, id, x, y, z);
        this.base = base;
        this.altura = altura;
        this.alturaBase = alturaBase;   
    }
    
    public float getBase(){
        return base;
    }
    
    public float getAlturaBase(){
        return alturaBase;
    }
    
    public float getAltura(){
        return altura;
    }
    
    @Override
    public double obterVolume(){
        double Abase = (base * altura) / 2;
        double volume = (Abase * altura) / 3;
        return volume;
    }
    
    @Override
    public String toString(){
        String atual = super.toString();
        return atual + ", p(" + super.getX() + ", " + super.getY() + ", " + super.getZ() + "), B: " + base + ", H: " + altura + ", Hbase: " + alturaBase + ", Volume: " + obterVolume();
    }
    
}
