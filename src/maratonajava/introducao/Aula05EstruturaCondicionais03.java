package maratonajava.introducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        double salario = 2000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}


//        if (salario > 5000){
//            resultado = mensagemDoar;
//        }else{
//            resultado = mensagemNaoDoar;
//        }
