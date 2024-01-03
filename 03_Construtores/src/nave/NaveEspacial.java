package nave;

import java.util.Random;

public class NaveEspacial {
    private String nome;
    private int velocidade;
    
    Random rand = new Random();
    
    public NaveEspacial(String s){
        setNome(s);
        this.velocidade = rand.nextInt(6);
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void setVelocidade(int v){
        this.velocidade = v;
    }
    
    public String mostrarNave(){
        return "\nNome: " + nome
            + "\nVelocidade: " + velocidade;
    }
}
