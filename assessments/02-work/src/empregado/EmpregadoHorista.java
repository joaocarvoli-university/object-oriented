package empregado;

public class EmpregadoHorista extends Empregado {
    private double horasTrabalhadas;
    private double valorHora;

    public EmpregadoHorista(){
        setNome(" ");
        setCpf(" ");
        horasTrabalhadas = 0;
        valorHora = 0;
    }
    public EmpregadoHorista(String nome, String cpf, double horasTrabalhadas, double valorHora){
        setNome(nome);
        setCpf(cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getValorHora(){
        return valorHora;
    }
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    @Override
    public double obterSalario(){
        setSalario(horasTrabalhadas*valorHora);
        return getSalario();
    }
}
