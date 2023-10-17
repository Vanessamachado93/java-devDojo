package maratonajava.javacore.Gassociacao.dominio;

import java.util.Scanner;

public class AdaTech {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a nota do aluno");
        double nota = input.nextInt();

        if (nota >= 70) {
            System.out.println("Graduação A");
        } else if (nota < 80 && nota >= 70) {
            System.out.println("Graduação B");
        } else if (nota < 60 && nota >= 0) {
            System.out.println("Graduação 0");
        } else {
            System.out.println("Nota inválida");
        }
    }
}

