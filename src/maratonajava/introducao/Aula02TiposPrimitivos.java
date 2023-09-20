package maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //São 8 tipos = int, double, char, bute, short, long, boolean --- tudo em letra minusculas
        //Tipos primitivos são todos numéricos, com exceto do boolean que é true ou false a diferença entre eles é o tamanho da variável
        // Convenção das variáveis, sempre com a primeira minuscula, se for composta idadeDoPai, em inglês
        // Cada tipo primitivo tem o seu tamanho, o char converte para a tabela ascii.
        // por exemplo numero 87 é a letra W. Unicode é \u0041 = A.
        //Hoje em dia o tamanho os computadores tem bastante memória, mas antigamente cada
        //byte era muito importante, prestar atenção quando criar uma váriavel pq se daqui alguns
        //anos o sistema estiver rodando ela vai continuar suportado.
        // Cast é quando vc força um tipo primitivo dentro do outro, mas sinaliza pro java
        //colocando entre parente e adicionando a letrinha no final.
        //String é ---reference type---
        // Podemos usar o java 15 e setar o java 8 no projeto, se caso tiver necessidade.
        int age = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        double salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'F';

        var cor = "Azul";

        String nome = "Vanessa desenvolvedora Java";

        System.out.println("A idade é " +age+" anos");
        System.out.println(verdadeiro);
        System.out.println("Oi meu nome é " +nome);
        System.out.println(cor);
    }
}

//https://www.youtube.com/watch?v=veDgI_zZ7uk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=12
//Link da aula