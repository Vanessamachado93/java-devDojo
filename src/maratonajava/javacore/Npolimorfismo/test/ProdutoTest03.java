package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;


public class ProdutoTest03 {

    public static void main(String[] args) {
        Produto produto = new Computador("MACKBOOKM3", 28000);

       Tomate tomate = new Tomate("Tomate", 30);
       tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calculaImposto(tomate);
        System.out.println("-----------");
        CalculadoraImposto.calculaImposto(produto);
    }
}
