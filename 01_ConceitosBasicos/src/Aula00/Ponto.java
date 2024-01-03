// Layza Nauane - 12211BSI251

package Aula00;

public class Ponto {
    public int x;
    public int y;
    
    public void SetValores(int valor1, int valor2){
        x = valor1;
        y = valor2;
    } 
    
    public float CalculaDistancia(Ponto p){
        return (float) Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y)));
    }
}

