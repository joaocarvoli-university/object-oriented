import empregado.Empregado;
import empregado.EmpregadoBonificado;
import empregado.EmpregadoHorista;
import empresa.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa google = new Empresa();
        Empresa facebook = new Empresa();

        EmpregadoBonificado eb1 = new EmpregadoBonificado();
        eb1.setNome("João Victor");
        eb1.setCpf("12312312412");
        eb1.setSalario(12000);
        eb1.setBonus(4000);

        EmpregadoHorista eh1 = new EmpregadoHorista();
        eh1.setNome("Amanda");
        eh1.setCpf("231231231239");
        eh1.setHorasTrabalhadas(240);
        eh1.setValorHora(35);

        EmpregadoBonificado eb2 = new EmpregadoBonificado("Ana", "9123912949", 12400, 4500);
        Empregado e1 = new Empregado("José", "123123912", 45900);

        google.adicionarEmpregado(eb1);
        google.adicionarEmpregado(eh1);
        facebook.adicionarEmpregado(eb2);
        facebook.adicionarEmpregado(e1);

        System.out.print("A folha de pagamento do Google é: " + google.obterFolhaDePagamento() + "\n");
        System.out.println("A folha de pagamento do Facebook é: " + facebook.obterFolhaDePagamento());


    }
}
