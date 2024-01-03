package funcionarios;

public class Assistente extends Funcionarios{
    
    public Assistente(String nome, String mat){
        super(nome, mat);
    }
    
    @Override
    public double calculaSalario(){
        return super.getSalarioBase();
    }
    
    @Override
    public String mostraDados(){
        return super.mostraDados() 
                + "\nSalario total: " + calculaSalario();
    }
}
