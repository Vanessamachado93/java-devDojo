package maratonajava.javacore.Lckassesabstratas.Test;

import maratonajava.javacore.Lckassesabstratas.dominio.Desenvolvedor;
import maratonajava.javacore.Lckassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 6000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
