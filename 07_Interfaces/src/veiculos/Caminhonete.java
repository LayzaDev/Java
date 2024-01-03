package veiculos;

public class Caminhonete implements Veiculos{
    
    private String marca, modelo, cor;
    private int potencia;
    
    public Caminhonete(String marca, String modelo, String cor, int potencia){
        setMarca(marca);
        setCor(cor);
        setModelo(modelo);
        setPotencia(potencia);
    }
    
    @Override
    public String getMarca(){
        return marca;
    }
    
    @Override
    public void setMarca(String m){
        this.marca = m;
    }
    
    @Override
    public String getModelo(){
        return modelo;
    }
    
    @Override
    public void setModelo(String m){
        this.modelo = m;
    }
    
    @Override
    public String getCor(){
        return cor;
    }
    
    @Override
    public void setCor(String c){
        this.cor = c;
    }
    
    @Override
    public int getPotencia(){
        return potencia;
    }
    
    @Override
    public void setPotencia(int p){
        this.potencia = p;
    }
    
    @Override
    public String mostraDados(){
        return "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nCor: " + cor
                + "\nPotencia: " + potencia;
    }
}

