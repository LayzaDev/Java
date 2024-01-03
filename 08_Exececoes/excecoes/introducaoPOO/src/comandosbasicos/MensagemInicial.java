package comandosbasicos;

public class MensagemInicial {
    
    private String responsavel = "Layza Nauane de Paula Silva";
    private String  turma = "Sistemas de Informação";
    private String  descricao = "Relatório do aluno"; 

    public String mostraDados(){

        return "Este é o meu primeiro programa em Java!\n"
                + "\nResponsavel: " + responsavel
                + "\nTurma: " + turma + "   Criado em __/__/____    Modificado em __/__/____"
                + "\nDescrição: " + descricao;
    }
       
}
