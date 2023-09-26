package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        //Dois objetos
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        //Inicializando os dois objetos
        estudante01.nome = "Goku";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
