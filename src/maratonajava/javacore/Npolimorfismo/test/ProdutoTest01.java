package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MACKBOOK", 8000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calculaImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calculaImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calculaImposto(tv);
    }
}
