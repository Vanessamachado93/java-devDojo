package maratonajava.javacore.Lckassesabstratas.Test;

import maratonajava.javacore.Lckassesabstratas.dominio.Desenvolvedor;
import maratonajava.javacore.Lckassesabstratas.dominio.Funcionario;
import maratonajava.javacore.Lckassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 1200);
        System.out.println(gerente);
    }
}
