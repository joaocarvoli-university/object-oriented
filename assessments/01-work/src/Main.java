package questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(funcionario.toString());

        Repositorio repositorio = new Repositorio();
        Scanner input = new Scanner(System.in);
        boolean adicionar;
        boolean promover;
        boolean continuar;
        String cpf;
        String cargo;
        String nome;
        String sobrenome;
        double salario;


        System.out.println("Seja bem-vindo ao sistema de cadastro de funcionários!\n");
        while(true){
            // Cadastro
            System.out.println("Você deseja adicionar um novo funcionário? - Digite 'true' para sim e 'false' para não\n");
            adicionar = Boolean.parseBoolean(input.next());
            // NÃO CONSEGUI FAZER O NEXTLINE FUNCIONAR...
            if (adicionar) {
                System.out.println("Insira o nome do funcionário: ");
                nome = input.next();
                System.out.println("Insira o sobrenome do funcionário: ");
                sobrenome = input.next();
                System.out.println("Insira o cpf do funcionário: ");
                cpf = input.next();
                System.out.println("Insira o cargo do funcionário: ");
                cargo = input.next();
                System.out.println("Insira o salário do funcionário: ");
                salario = Double.parseDouble(input.next());
                Funcionario funcionario = new Funcionario(cpf,cargo,nome,sobrenome,salario);
                repositorio.adicionarFuncionario(funcionario);
                System.out.println(funcionario.toString());
                funcionario = null;
            }
            // Para precaver de erros
            nome = null;
            sobrenome = null;
            cpf = null;
            cargo = null;
            salario = 0;

            // Promoçao
            System.out.println("Você deseja promover algum funcionário? - Digite 'true' para sim e 'false' para não\n");
            promover = Boolean.parseBoolean(input.next());
            if(promover) {
                System.out.println("Digite o cpf do funcionário: ");
                cpf = input.next();
                Funcionario funcionarioPromover = repositorio.obterFuncionario(cpf);
                if(funcionarioPromover != null){
                    System.out.println("Digite o novo cargo do funcionário: ");
                    cargo = input.next();
                    System.out.println("Digite o novo salário do funcionário: ");
                    salario = Double.parseDouble(input.next());
                    funcionarioPromover.promover(cargo, salario);
                    System.out.println(funcionarioPromover.toString());
                }
            }
            cpf = null;
            cargo = null;
            salario = 0;
            System.out.println("\n");
            System.out.println(repositorio.toString());
            System.out.println("\n");
            System.out.println("Você deseja continuar? - Digite 'true' para sim e 'false' para não");
            continuar = Boolean.parseBoolean(input.next());
            if(!continuar){
                adicionar = false;
                promover = false;
                continuar = false;
                break;
            }
        }
        System.out.println("Sistema encerrado!");
    }
}
