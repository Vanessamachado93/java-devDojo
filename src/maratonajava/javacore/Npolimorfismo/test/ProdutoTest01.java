package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MACKBOOK", 8000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
