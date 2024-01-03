package javaapplication19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaApplication19 {
    public static void main(String[] args) {
        BufferedWriter escritor = null; //objetoescritor
        try {
            escritor = new BufferedWriter(new FileWriter("arquivo.txt")); //Instanciação do objeto escritor
            escritor.write("texto"); //Gravaçãodotexto
            escritor.flush(); //descarga do buffer de escrita
            escritor.close(); //fechamento doarquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
