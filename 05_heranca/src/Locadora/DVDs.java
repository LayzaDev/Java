package Locadora;

public class DVDs extends Locadora {
    
    private String atores;
    private String diretor;
    private int duracao;

    public DVDs(String nome, String tipo, String genero, double preco, String atores, String diretor, int duracao) {
        super(nome, tipo, genero, preco);
        this.atores = atores;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getAtores() {
        return atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Atores: " + atores + ", Diretor: " + diretor + ", Duração: " + duracao + " horas";
    }
}
