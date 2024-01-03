package empresa;

public class Noturno extends Funcionarios{
    private int adicional, noitesTrab;
    
    public Noturno(int mat, String nome, int idade, String cpf, int numNoites){
        super(mat, nome, idade, cpf);
        this.adicional = 100;
        setNoitesTrab(numNoites);
    }
    
    public int getAdicional(){
        return adicional;
    }
    
    public int getNoitesTrab(){
        return noitesTrab;
    }
    
    public void setNoitesTrab(int num){
        this.noitesTrab += num;
    }
    
    public double calculaAdicional(){
        return adicional * this.noitesTrab;
    }
    
    @Override
    public double calculaSalarioMensal(){
        return super.getSalarioBase() + calculaAdicional();
    }
        
    @Override
    public String mostraDados(){
        return super.mostraDados();
    }
    
    @Override
    public String mostraFolhaPagamento(){
        return super.mostraDados()
                + "\nAdicional: " + this.adicional
                + "\nNoites trabalhadas: " + this.noitesTrab
                + "\nAdicional a receber: " + calculaAdicional()
                + "\nSalario a receber: " + calculaSalarioMensal();
    }
}
