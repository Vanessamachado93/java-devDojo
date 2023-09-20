package maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        int idade = 19;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não é autorizado");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar");
        }
//        System.out.println("Não pode comprar mé");
    }
}

