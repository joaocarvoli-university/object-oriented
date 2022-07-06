package empregado;

public class EmpregadoBonificado extends Empregado {
    private double bonus;

    public EmpregadoBonificado(){
        setNome(" ");
        setCpf(" ");
        setSalario(0);
        bonus = 0;
    }
    public EmpregadoBonificado(String nome, String cpf, double salario, double bonus){
        setNome(nome);
        setCpf(cpf);
        setSalario(salario);
        this.bonus = bonus;
    }


    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    @Override
    public double obterSalario(){
        return getSalario() + bonus;
    }
}
