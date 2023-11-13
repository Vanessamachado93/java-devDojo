package maratonajava.javacore.Npolimorfismo.servico;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Ralatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador "+computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Ralatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador "+tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
    }
}
