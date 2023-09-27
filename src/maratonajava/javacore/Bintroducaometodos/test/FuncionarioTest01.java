package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Vegeta";
        funcionario.idade = 40;
        funcionario.salarios = new double[]{1200, 967.32, 3000};

        funcionario.imprime();
//        funcionario.imprimeMediaSalario();
    }
}
