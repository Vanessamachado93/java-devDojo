package maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double dividiDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double dividiDoisNumeros2(double num1, double num2){
        if(num2 == 0){
            return 0;
        }else{
            return num1/num2;
        }
    }

    public void alteraDoisNumeros(int mum1, int mum2){
        int numero1 = 99;
        int numero2 = 33;
        System.out.println("Dentro do alterado do alteraDoisNumeros");
        System.out.println("Num1 " +numero1);
        System.out.println("Num2 " +numero2);

    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }


    public void somarVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
