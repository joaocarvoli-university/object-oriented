package empregado;

public class Empregado {
    private String nome;
    private String cpf;
    private double salario;

    public Empregado(){
        nome = "João";
        cpf = "123.456.789-12";
        salario = 30000.0;
    }

    public Empregado(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }
    public String cpf(){
        return cpf;
    }
    public double getSalario(){
        return salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void promover(){
        setSalario(getSalario()*1.05);
    }
    public void promover(double acrescimoSalarial){
        setSalario(getSalario() + getSalario()*acrescimoSalarial);
    }
    public double obterSalario(){
        return getSalario();
    }
}
