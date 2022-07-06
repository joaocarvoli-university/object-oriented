package questao01;

public class Funcionario {
    private String cpf;
    private String nome;
    private String sobrenome;
    private String cargo;
    private double salario;

    public Funcionario(String cpf, String cargo, String nome, String sobrenome, double salario){
        this.cpf = cpf;
        this.cargo = cargo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    // Getters
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getCargo(){
        return this.cargo;
    }
    public double getSalario(){
        return this.salario;
    }


    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void promover(String cargo, double salario){
        setCargo(cargo);
        setSalario(salario);
        System.out.println("O funcionário " + this.nome + " foi promovido!");
    }

    //@Override
    public String toString(){
        return "O  " + this.nome + " " + this.sobrenome + ", possui o cpf " + this.cpf + ", ocupa o cargo de " + this.cargo + " e seu salário é " + this.salario;
    }


}
