package maratonajava.javacore.Oexeception.exception.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) throws IllegalAccessException {
        divisao(1, 5);
        System.out.println("Código finalizado");
    }
    private static int divisao(int a, int b) throws IllegalAccessException {
       if(b == 0){
           throw new IllegalAccessException("Argumento ilegal, não pode ser 0");
       }
       return a/b;
    }
}
