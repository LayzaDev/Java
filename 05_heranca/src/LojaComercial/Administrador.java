package LojaComercial;

public class Administrador extends Funcionario {
    private int horasExtras;
    
    public Administrador(String nome, String rg, float salarioBase){
        super(nome, rg, salarioBase);
        this.horasExtras = 0;     
    }
    
    public void registrarHorasExtras(int horas){
        horasExtras += horas;
    }
    
    public int getHorasExtras(){
        return horasExtras;
    }
    
    public double calcularSalario(){
        float valorHorasExtras = horasExtras * (getSalario() / 100);
        return  getSalario() + valorHorasExtras;
    }
    
    public void zeraHoras(){
        horasExtras = 0;
    }
    
    public String exibeAdm(){
        return super.toString() + "\nHoras Extras: " + getHorasExtras() + "\nSalario total: " + calcularSalario();
    }
}
