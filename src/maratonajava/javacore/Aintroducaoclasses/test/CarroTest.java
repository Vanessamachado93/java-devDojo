package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;
public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca Bala";
        carro1.ano = 1969;
        carro1.modelo = "Sport";

        carro2.nome = "Mustang";
        carro2.ano = 1968;
        carro2.modelo = "GT 500";

        carro1 = carro2;

        System.out.println("\nCarro 1");
        System.out.println(carro1.nome + carro1.modelo + " "+ carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome + carro2.modelo + " "+ carro2.ano);

    }
}
