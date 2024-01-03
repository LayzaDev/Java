// Layza Nauane - 12211BSI251

package Aula00;

public class Triangulo {
    
    private int lado1, lado2, lado3, id;
    
    public void setLado1(int lado){
        lado1 = lado;
    }
    
    public int getLado1(){
        return lado1;
    }
    
    public void setLado2(int lado){
        lado2 = lado;
    }
    
     public int getLado2(){
        return lado2;
    }
     
    public void setLado3(int lado){
        lado3 = lado;
    }
    
     public int getLado3(){
        return lado3;
    }
    
    public int calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    
    public String getDefinirTipoTriangulo(){
        
        if(lado1 == lado2 && lado2 == lado3){
            
            return "Equilatero";
            
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            
            return "Isosceles";  
            
        } else {
            
           return "Escaleno";
        }
    }
    
    public void setLadosTriangulo(int lado1, int lado2, int lado3, int id){
        
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Triangulo " + id + " => L1: " + lado1 +  ", L2: " + lado2 + ", L3: " + lado3 + ", Tipo: " + getDefinirTipoTriangulo() + "\n"; 
    }
}
