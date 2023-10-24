package maratonajava.javacore.Hheranca.Test;

import maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0- Bloco de inicialização estático da super classe é executado quando a JVM carrega classe pai
    //1- Bloco de inicialização estático da subclasse é executado quando a JVM carrega classe filha
    //2- Alocado espaço em memória pro objeto da superclasse
    //3 -Cada atributo de superclasse é criado e inicializado com valores default ou a quer for passada
    //4- Bloco de inicialização da superclasse é executado na ordem em que aparece
    //5- Construir é executado da superclasse
    //6- Alocado espaço em memória pro objeto da subclasse
    //7- Cada atributo de subclasse é criado e inicializado com valores default ou que for passado
    //8- Bloco de inicialização da subclasse é executado na ordem em que aparece
    //9- Construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Vegeta");
    }
}
