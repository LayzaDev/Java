package formasgeometricas;

public class Tetraedro extends FormaTrid {
    
    private int base, altura, areaBase;
    
    public Tetraedro(int id, String cor, int x, int y, int z, int base, int altura){
        super(id, cor, x, y, z);
        this.base = base;
        this.altura = altura;
        this.areaBase = (1/2) * base * altura;
    }
    
    public int getBase(){
        return base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    @Override
    public double obterVolume(){
        return (1/3) * areaBase * altura;
    }
    
    @Override 
    public String toString(){
        return super.toString() 
                + ", base: " + base 
                + ", altura: " + altura
                + ", area da base: " + areaBase
                + ", volume: " + obterVolume();
    }
}
