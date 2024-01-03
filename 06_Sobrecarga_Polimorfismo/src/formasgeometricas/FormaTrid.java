package formasgeometricas;

public abstract class FormaTrid extends Formas {
    
    private int x, y, z;
    
    public FormaTrid(int id, String cor, int x, int y, int z){
        super(id, cor);
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getZ(){
        return z;
    }
    
    public abstract double obterVolume();
    
    @Override
    public String toString(){
        return super.toString() 
                + "p(" + x + ", " + y + ", " + z + ")";
    }
}
