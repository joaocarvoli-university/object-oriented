package questao01;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Funcionario> repositorio;
    private int qntFuncionarios;

    public Repositorio(){
        this.repositorio = new ArrayList<Funcionario>();
    }

    public boolean adicionarFuncionario(Funcionario newFuncionario){
        if(qntFuncionarios < 10){
            repositorio.add(newFuncionario);
            qntFuncionarios++;
            return true;
        }
        System.out.println("Não é possível adicionar mais funcionários!");
        return false;
    }

    public Funcionario obterFuncionario(String cpf){
        for(Funcionario funcionario:this.repositorio){
            if (funcionario.getCpf().equals(cpf)) {
                System.out.println("Funcionário encontrado!");
                return funcionario;
            }
        }
        System.out.println("O funcionário não foi encontrado!");
        return null;
    }

    //@Override
    public String toString(){
        System.out.println("Repositório atual");
        for(Funcionario funcionario:this.repositorio){
            System.out.println(funcionario.toString());
        }
        return "";
        // NÃO HÁ COMO RETORNAR EM CADA ITERAÇÃO DO FOR POIS SE NÃO TEREMOS APENAS O PRIMEIRO FUNCIONÁRIO
    }
}
