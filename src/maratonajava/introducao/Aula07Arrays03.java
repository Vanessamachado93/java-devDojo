package maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2]= "Luffy";
        nomes[3]= "vegeta";

        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
            
        }
    }
}