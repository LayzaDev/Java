package Locadora;

public class FitaVHS extends Locadora{
    private boolean rebobinada;


    public FitaVHS(String nome, String tipo, String genero, double preco, boolean rebobinada){
        super(nome, tipo, genero, preco);
        this.rebobinada = rebobinada;
    }

    public boolean isRebobinada() {
        return rebobinada;
    }
    
    @Override
    public String toString() {
        String estadoRebobinada = rebobinada ? "Rebobinada" : "Não rebobinada";
        return super.toString() + ", Estado da Fita: " + estadoRebobinada;
    }
    
    
}
