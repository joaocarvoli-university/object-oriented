package empresa;

import empregado.Empregado;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empregado> empresa;
    private double folhaDePagamento = 0;
    public Empresa(){
        empresa = new ArrayList<Empregado>();
    }
    public void adicionarEmpregado(Empregado empregado){
        if(empresa.size() < 3){
            empresa.add(empregado);
        } else {
            System.out.println("Você não pode adicionar mais empregados!");
        }
    }
    public double obterFolhaDePagamento(){
        for(Empregado e: empresa){
            folhaDePagamento += e.obterSalario();
        }
        return folhaDePagamento;
    }
}
