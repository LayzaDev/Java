package encapsulamento;

import encapsulamento.Ponto;
import static java.lang.Math.pow;

public class Circulo {
    private String nome;
    private double raio, diametro, circunferencia, area;
    private double x, y;
    private Ponto p;
    
    public void setCirculo(double r, Ponto centro){
        this.nome = "Circulo";
        this.raio = r;
        this.x = centro.getX();
        this.y = centro.getY();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setRaio(float r){
        this.raio = r;
    }
    
    public void setCentro(Ponto p){
        this.p = p;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public Ponto getCentro(){
        return p;
    }
    
    public double calcularDiametro(){
        return raio * 2;
    }
    
    public double calcularPerimetro(){
        double pi = Math.PI;
        return 2 * pi * raio;
    }
    
    public double calcularArea(){
        double pi = Math.PI;
        return pi * pow(raio, 2);
    }
    
    @Override
    public String toString(){
        return "================================================="
                + "\nDados do " + nome + " de raio " + raio
                + "\nDiametro: " + calcularDiametro()
                + "\nCircunferencia: " + calcularPerimetro()
                + "\nArea: " + calcularArea()
                + "\n=================================================";
    }
}
