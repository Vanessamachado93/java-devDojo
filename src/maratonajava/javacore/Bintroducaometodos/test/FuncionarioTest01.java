package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Vegeta");
        funcionario.setIdade(40);
        funcionario.setSalarios(new double[]{1200, 967.32, 3000});

        funcionario.imprime();
        System.out.println("Média "+ funcionario.getMedia());
    }
}
