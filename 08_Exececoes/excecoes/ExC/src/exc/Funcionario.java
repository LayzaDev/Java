package exc;

public class Funcionario {
    
    String CPF;
    double salarioBruto, desconto;
    
    public Funcionario(String cpf, double salarioBruto, double desconto){
        this.CPF = cpf;
        this.salarioBruto = salarioBruto;
        this.desconto = desconto;
    }
    
    public String getCpf() {
        return CPF;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getDescontos() {
        return desconto;
    }

    public void setCpf(String cpf) {
        this.CPF = cpf;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setDescontos(double descontos) {
        this.desconto = descontos;
    }
    
    public double calculaSalarioBruto(){
        return salarioBruto - desconto;
    }

    public static Funcionario fromString(String line){
        String[] parts = line.split(",");
        if(parts.length == 3){
            String cpf = parts[0];
            double salarioBruto = Double.parseDouble(parts[1]);
            double descontos = Double.parseDouble(parts[2]);
            return new Funcionario(cpf, salarioBruto, descontos);
        }
        return null;
    }
}
