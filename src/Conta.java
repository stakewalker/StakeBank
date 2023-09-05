public class Conta {
    private int numero;
    private double saldo;
    private double limite;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public boolean saca(double valor) {
        if (saldo + limite < valor) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
