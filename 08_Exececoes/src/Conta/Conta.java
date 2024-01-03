package Conta;

public class Conta {
    private String nome;
    private float saldo;
    private int idade;
    private String cpf;
    private String telefone;
    private String tipoDeConta;
    
    public Conta(String nome, float saldo, int idade,String cpf, String telefone, String tipo){
        if(!tipo.equals("Corrente") && !tipo.equals("Poupanca")){
            throw new IllegalArgumentException("O tipo de conta deve ser corrente ou poupanca.");
        }
        
        if(saldo < 0 || idade < 0){
            throw new IllegalArgumentException("O saldo e a idade devem ser um valor positivo.");
        }
        
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
        this.saldo = saldo;
        this.telefone = telefone;
        this.tipoDeConta = tipo;
    }
    
    public String getTipo()
    {
        return tipoDeConta;
    }
    public String getCpf()
    {
        return cpf;
    }
    public int getIdade()
    {
        return idade;
    }
    
    public String getConta(){
        return "telefone: "+telefone+" nome: "+nome+" saldo: "+saldo+" \n";
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public int deposito(float valor){
        if(valor > 0){
            saldo+=valor;
            return 0;
        } else {
            throw new IllegalArgumentException("O valor do deposito precisa ser maior que 0.");
        }
    }
    
    public int saque(float valor) throws Excecao{
        if(valor <= saldo && valor > 0){
           this.saldo -= valor;
           return 0;
        } else if(valor < 0){
           throw new IllegalArgumentException("O valor do deposito precisa ser maior que 0.");
        } else {
            throw new Excecao("O valor do saque é maior que o saldo atual.");
        }
    }
    
    public int transferencia(float valor, Conta recebeTransf){
        boolean verificaTransf = valor <= (saldo+100) && valor > 0 && !recebeTransf.nome.equals(nome);
        if(verificaTransf){
            saldo-=valor;
            recebeTransf.saldo += valor;
            return 0;
        }
        return 1;
    }
}
