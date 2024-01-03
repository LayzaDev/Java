package Locadora;

public class CDs extends Locadora {
    
    private String cantor;
    private int numFaixas;

    public CDs(String nome,String tipo, String genero, double precoLocacao, String cantor, int numFaixas) {
        super(nome, tipo, genero, precoLocacao);
        this.cantor = cantor;
        this.numFaixas = numFaixas;
    }

    public String getCantor() {
        return cantor;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantor: " + cantor + ", Número de Faixas: " + numFaixas;
    }
    
}
