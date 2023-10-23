package maratonajava.javacore.Hheranca.Test;

import maratonajava.javacore.Hheranca.dominio.Endereco;
import maratonajava.javacore.Hheranca.dominio.Funcionario;
import maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("96700-000");
        Pessoa pessoa = new Pessoa("Naruto");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario( "Oda Nobunda");
        funcionario.setCpf("22222222");
        System.out.println("----------");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        funcionario.imprime();
    }
}
