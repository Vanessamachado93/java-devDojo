package maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        int idade = 12;
        String categoria;
        if (idade < 15){
            categoria = "Categoria Juvenil";
        }else if (idade >=15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categotia Adulto";
        }
        System.out.println(categoria);
    }
}
