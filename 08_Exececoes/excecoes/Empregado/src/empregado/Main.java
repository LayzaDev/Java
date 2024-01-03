package empregado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String caminhoArquivo = "arquivo.txt";
    public static void main(String[] args) {
        
        List<Empregado> empregados = carregaDados(caminhoArquivo);
        
        if(empregados == null){
            empregados = new ArrayList<>();
        }
        
        Scanner scanner = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("Menu:");
            System.out.println("(1) Cadastrar empregados");
            System.out.println("(2) Procurar empregado");
            System.out.println("(3) Verificar salários");
            System.out.println("(4) Ordenar por idade");
            System.out.println("(5) Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Informe os dados do empregado:");
                    System.out.print("CPF: ");
                    String cpf = scanner.next();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();

                    // Verifica se o CPF já existe
                   boolean cpfExiste = false;
                    for (Empregado empregado : empregados) {
                        if (empregado.getCpf().equals(cpf)) {
                            cpfExiste = true;
                            break;
                        }
                    }

                    if (!cpfExiste) {
                        Empregado empregado = new Empregado(cpf, idade, salario);
                        empregados.add(empregado);
                    } else {
                        System.out.println("CPF já cadastrado. Não é possível cadastrar novamente.");
                    }

                    break;
                case 2:
                    System.out.print("Informe o CPF do empregado a ser pesquisado: ");
                    String pesquisa = scanner.next();
                    for(Empregado empregado : empregados){
                        if(empregado.getCpf().equals(pesquisa)){
                            empregado.mostraDados();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Informe o valor do salário base: ");
                    double salarioBase = scanner.nextDouble();
                    for(Empregado empregado : empregados){
                        if(empregado.getSalario() > salarioBase ){
                            empregado.mostraDados();
                        }
                    }
                    break;
                case 4:
                    Collections.sort(empregados);
                    System.out.println("Empregados ordenados por idade:");
                    int index = 1;
                    for(Empregado empregado : empregados){
                        System.out.println("Empregado " + index + ":");
                        empregado.mostraDados();
                        index++;
                    }
                    
                    break;
            }
        } while (op != 5);

        salvarDados(caminhoArquivo, empregados);
    }
    
     private static List<Empregado> carregaDados(String caminhoArquivo) {
        List<Empregado> empregados = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminhoArquivo))) {
            empregados = (List<Empregado>) ois.readObject();
            System.out.println("Empregados carregados com sucesso!");
        } catch (FileNotFoundException e) {
            // Arquivo não existe, retornar null para criar uma nova lista
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar os empregados: " + e.getMessage());
        }
        return empregados;
    }

    private static void salvarDados(String caminhoArquivo, List<Empregado> empregados) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminhoArquivo))) {
            oos.writeObject(empregados);
            System.out.println("Empregados salvos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar os empregados: " + e.getMessage());
        }
    }
}
