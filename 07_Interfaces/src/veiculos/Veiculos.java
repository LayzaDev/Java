package veiculos;

public interface Veiculos {
    
    void setMarca(String marca);
    String getMarca();
    void setModelo(String mod);
    String getModelo();
    void setCor(String cor);
    String getCor();
    void setPotencia(int pot);
    int getPotencia();
    String mostraDados(); 
}
