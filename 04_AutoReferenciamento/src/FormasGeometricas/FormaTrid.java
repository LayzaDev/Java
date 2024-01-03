package FormasGeometricas;

public abstract class FormaTrid extends Forma{
    
    private float x, y, z;
   
    public FormaTrid(String cor, int id, float x, float y, float z){
       super(cor, id);
       this.x = x;
       this.y = y;
       this.z = z;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public float getZ(){
        return z;
    }
    
    public abstract double obterVolume();
} 
