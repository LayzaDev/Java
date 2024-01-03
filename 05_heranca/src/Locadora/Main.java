// Layza Nauane de Paula Silva - 12211BSI251
package Locadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DVDs[] dvds = new DVDs[5];
        CDs[] cds = new CDs[5];
        FitaVHS[] fitasVHS = new FitaVHS[5];

        int opcao = 0;
        int contadorDVDs = 0;
        int contadorCDs = 0;
        int contadorFitasVHS = 0;

        do {
            System.out.println("\nEscolha uma opcao:\n");
            System.out.println("1. Locar DVD");
            System.out.println("2. Locar CD");
            System.out.println("3. Locar fita VHS");
            System.out.println("4. Visualizar DVDs locados");
            System.out.println("5. Visualizar CDs locados");
            System.out.println("6. Visualizar fitas VHS locadas");
            System.out.println("7. Encerrar ");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    if (contadorDVDs < dvds.length) {
                        System.out.println("\n=========== INFORMACOES DO DVD ===========\n");

                        System.out.println("Nome do DVD: ");
                        String nome = scan.next();
                        
                        System.out.println("Tipo (audio/video)");
                        String tipoDVD = scan.next();

                        System.out.println("Genero: ");
                        String genero = scan.next();

                        System.out.println("Preco: ");
                        double preco = scan.nextDouble();

                        System.out.println("Ator: ");
                        String atores = scan.next();
                        
                        System.out.println("Nome do diretor: ");
                        String diretor = scan.next();

                        System.out.println("Tempo de Duracao: ");
                        int duracao = scan.nextInt();

                        DVDs dvd = new DVDs(nome, tipoDVD, genero, preco, atores, diretor, duracao);

                        dvds[contadorDVDs] = dvd;

                        System.out.println("\nDVD locado com sucesso!");
                        
                        contadorDVDs++;
                    } else {
                        System.out.println("\nQuantidade maxima de locacoes atingida");
                    }
                    break;
                case 2:
                    if (contadorCDs < cds.length) {
                        System.out.println("\n=========== INFORMACOES DO CD ===========\n");

                        System.out.println("Nome do CD: ");
                        String nome = scan.next();
                        
                        System.out.println("Tipo (audio/video)");
                        String tipoCD = scan.next();

                        System.out.println("Genero: ");
                        String genero = scan.next();

                        System.out.println("Preco: ");
                        double preco = scan.nextDouble();

                        System.out.println("Cantor: ");
                        String cantor = scan.next();

                        System.out.println("Numero de faixas: ");
                        int numeroDeFaixas = scan.nextInt();

                        CDs cd = new CDs(nome, tipoCD, genero, preco, cantor, numeroDeFaixas);

                        cds[contadorCDs] = cd;

                        System.out.println("\nCD locado com sucesso!");

                        contadorCDs++;
                    } else {
                       System.out.println("\nQuantidade maxima de locacoes atingida");
                    }
                    break;
                case 3:
                    if (contadorFitasVHS < fitasVHS.length) {
                        System.out.println("\n=========== INFORMACOES DA FITA VHS ===========\n");
                        
                        System.out.println("Nome da fita: ");
                        String nome = scan.next();
                        
                        System.out.println("Tipo (audio/video)");
                        String tipo = scan.next();

                        System.out.println("Genero: ");
                        String genero = scan.next();

                        System.out.println("Preco: ");
                        double preco = scan.nextDouble();

                        System.out.println("Fita rebobinada (true/false): ");
                        boolean rebobinada = scan.nextBoolean();

                        FitaVHS fitaVHS = new FitaVHS(nome, tipo, genero, preco, rebobinada);

                        fitasVHS[contadorFitasVHS] = fitaVHS;

                        System.out.println("Fita VHS locada com sucesso!");

                        contadorFitasVHS++;
                    } else {
                        System.out.println("Quantidade maxima de locacoes atingida");
                    }
                    break;
                case 4:
                    System.out.println("\n=========== DVDs Locados ===========\n");
                    for (int i = 0; i < contadorDVDs; i++) {
                        System.out.println(dvds[i]);
                    }
                    
                    float valorTotalDVD = 0;
                    
                    for(int i = 0; i < contadorDVDs; i++){

                        valorTotalDVD += dvds[i].getPreco();
                    }

                    System.out.println("\nValor a pagar: " + valorTotalDVD);
                    break;
                case 5:
                    System.out.println("\n=========== CDs Locados ===========\n");
                    for (int i = 0; i < contadorCDs; i++) {
                        System.out.println(cds[i]);
                    }
                    
                    float valorTotalCD = 0;
                    
                    for(int i = 0; i < contadorCDs; i++){

                        valorTotalCD += cds[i].getPreco();
                    }

                    System.out.println("\nValor a pagar: " + valorTotalCD);
                    break;
                case 6:
                    
                    System.out.println("\n=========== Fitas VHS Locadas ===========\n");
                    
                    for (int i = 0; i < contadorFitasVHS; i++) {
                        System.out.println(fitasVHS[i]);
                    }
                    float valorTotalVHS = 0;
                    
                    for(int i = 0; i < contadorFitasVHS; i++){
                        
                        valorTotalVHS += fitasVHS[i].getPreco();
                    }
                        
                    System.out.println("\nValor a pagar: " + valorTotalVHS);
                    break;
                case 7:
                    System.out.println("\nObrigada pela preferencia, volte sempre!\n");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (opcao != 7);
    }
}

