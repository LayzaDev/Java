package LojaComercial;


public class Vendedor extends Funcionario {
    
    private float vendasDoMes;
    private float comissao; 
    private int unidades;
    
    public Vendedor(String nome, String rg, float salarioBase){
        super(nome, rg, salarioBase);
        this.comissao = 0.05f;
        this.vendasDoMes = 0;
    }
    
    public void registrarVendas(float valor, int unidades){
        vendasDoMes += valor;
        this.unidades += unidades;
    }
    
    public float getTotalVendas(){
        return vendasDoMes;
    }
   
    public float calcularSalario(){ 
        return getSalario() + (comissao * unidades);
    }
    
    public void zeraVendas(){
        this.unidades = 0;
    }
    
    public String exibeVendedor(){
        return super.toString() + "\nVendas do mes: " + getTotalVendas() + "\nSalario total: " + calcularSalario();
    }
}
