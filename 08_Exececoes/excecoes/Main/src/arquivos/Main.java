package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       
        String linha;
    
        BufferedReader arquivo = null; //Objeto leitor

        try{
            arquivo = new BufferedReader(
            new FileReader(
            new File("/Documents/file.txt")));
            //Instanciação do objeto leitor
            while((linha = arquivo.readLine()) != null) {
            //Leitura de uma linha do arquivo em "linha"
            }
            arquivo.close(); //fechamento do arquivo
        }catch (java.io.IOException e) {
            System.out.println("File error: " + e.toString());
        }
        }
    
        BufferedWriter escritor = null; //objeto escritor
        try{
            escritor = new BufferedWriter(
            new FileWriter(
            new File("Arquivo")));
            String texto;
            //Instanciação do objeto escritor
            escritor.write(texto); //Gravação do texto
            escritor.flush(); //descarga do buffer de escrita
            escritor.close(); //fechamento do arquivo
        } catch(IOException e){
            e.printStackTrace();
        }

    
}
