package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + -
        int numero01 = 10;
        int numero02 = 30;
        int resultado = numero02 + numero01;
        System.out.println(resultado);

        // Operador de Resto
        //
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 10;
        boolean isDezQuDiferenteVinte = 20 == 20;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezQuDiferenteVinte " + isDezQuDiferenteVinte);

        // && (and) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentoDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentoDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentoDaLeiMaiorQueTrinta " + isDentoDaLeiMaiorQueTrinta);
        System.out.println("isDentoDaLeiMenorQueTrinta " + isDentoDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorTotalContaPoupanca;
        System.out.println("isPlaystationCincoCompravel" + isPlaystationCincoCompravel);

        double bonus = 1800;
        bonus += 2000;
        bonus -= 1000;
        System.out.println(bonus);

        int contador = 0;
        contador +=1; // contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);
    }
}
