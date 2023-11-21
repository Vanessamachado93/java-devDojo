package maratonajava.javacore.Oexeception.exception.test;

import maratonajava.javacore.Oexeception.dominio.Leitor1;
import maratonajava.javacore.Oexeception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (IOException e) {

        }
    }
}

