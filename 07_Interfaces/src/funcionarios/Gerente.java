package funcionarios;

public class Gerente extends Funcionarios{
    
    public Gerente(String nome, String mat){
        super(nome, mat);
    }
    
    @Override
    public double calculaSalario(){
        return super.getSalarioBase() * 2;
    }
    
    @Override
    public String mostraDados(){
        return super.mostraDados() 
                + "\nSalario total: " + calculaSalario();
    }
}
