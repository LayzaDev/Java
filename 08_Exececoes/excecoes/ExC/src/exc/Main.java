package exc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        try{
            Map<String, Funcionario> funcionarios = new HashMap<>();
            
            String line;
            
            try{
                BufferedReader brSalBruto = new BufferedReader(new FileReader("salbruto.datedesc.dat"));
                while((line == brSalBruto.readLine()) != null){
                    Funcionario funcionario = Funcionario.fromString(line);
                    if(funcionario != null){
                        if(funcionarios.constainsKey(funcionario.getCpf())){
                            funcionarios.get(funcionario.getCpf()).salarioBruto = funcionario.salarioBruto;
                        } else {
                            funcionarios.put(funcionario.getCpf(), funcionario);
                        }
                    }
                }
            }
        }
    }
    
}
