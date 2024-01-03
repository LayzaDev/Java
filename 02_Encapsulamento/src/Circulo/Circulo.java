package Circulo;

public class Circulo {
    
    private double raio;
    private String nome;
    private int id;
    
    public Circulo(String n, double r, int id){
        
        if(r > 0){
            raio = r;
        }
        this.nome = n;
        this.id = id;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double getDiametro(){
        return Math.pow(raio, 2);
    }
    
    public double getCircunferencia(){
        return Math.round(2 * Math.PI * raio);
    }
    
    public double getArea(){
        return Math.round(Math.PI * Math.pow(raio, 2));
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    @Override 
    public String toString(){
        return "Dados do " + getNome() + " de raio " + getRaio() + "\nDiametro: " + getDiametro() + "\nCircunferencia: " + getCircunferencia() + "\nArea: " + getArea();
    }
}
