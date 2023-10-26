package maratonajava.javacore.Kenum.dominio;

public class Cliente {
    public static Object TipoPagamento;
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;


    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.VALOR+
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}

