package comandosbasicos;

public class Triangulo {
    
    private double lado1, lado2, lado3;
    private int id;
    
    public void setLado1(double l1){
        lado1 = l1;
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public void setLado2(double l2){
        lado2 = l2;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public void setLado3(double l3){
        lado3 = l3;
    }
    
    public double getLado3(){
        return lado3;
    }
    
    public void setTriangulo(double lado1, double lado2, double lado3, int id){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.id = id;
    }
    
    public double calculaPerimetroTriangulo(){
        return lado1 + lado2 + lado3;
    }
   
    public String classificaTriangulo(){
        if(getLado1() == getLado2() && getLado2() == getLado3()){
            return "\nTriangulo Equilatero";
        } else if(getLado1() != getLado2() && getLado2() != getLado3()){  
            return "\nTriangulo Escaleno";
        } else {
            return "\nTriangulo Isosceles";
        }
    }
    
    @Override
    public String toString(){
        return "\n" + id + ". "
                + classificaTriangulo()
                + "\nlado 1: " + lado1
                + "\nlado 2: " + lado2
                + "\nlado 3: " + lado3
                + "\n";
    }
}
