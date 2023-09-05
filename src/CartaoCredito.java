public class CartaoCredito {
    private String numero;
    private String validade;

    public CartaoCredito(String numero, String validade) {
        this.numero = numero;
        this.validade = validade;
    }

    public String getNumero() {
        return numero;
    }

    public String getValidade() {
        return validade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}