package LojaComercial;

public class Funcionario {
    private String nome, rg;
    private float salarioBase;
    
    public Funcionario(String nome, String rg, float salarioBase){
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getRG(){
        return rg;
    }
    
    public float getSalario(){
        return salarioBase;
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() + "\nRG: " + getRG() + "\nSalario Base: " + getSalario();
    }
}
