public class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public ContaPoupanca(String numero, double saldoInicial, double taxaDeJuros) {
        super(numero, saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void aplicarJuros() {
        double juros = getSaldo() * taxaDeJuros;
        depositar(juros);
    }
}

