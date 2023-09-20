package maratonajava.introducao;

public class Aula03TiposPrimitivosExercícios {
    public static void main(String[] args) {
        String nome = "Vanessa";
        String endereço = "São Jerônimo/RS";
        double salario = 7500.90;
        String dataRecebimentoSalario = "20/12/2021";
        String relatorio = "Eu " +nome+" moro na cidade "+endereço+"," +
                          " confirmo que recebi o salário: "
                          +salario+ " na data: " +dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
