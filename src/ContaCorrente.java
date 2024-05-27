public class ContaCorrente extends Conta {
    private double taxaDeOperacao;

    public ContaCorrente(String numero, double saldoInicial, double taxaDeOperacao) {
        super(numero, saldoInicial);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public boolean sacar(double valor) {
        valor += taxaDeOperacao;
        return super.sacar(valor);
    }

    @Override
    public boolean transferir(double valor, Conta destino) {
        valor += taxaDeOperacao;
        return super.transferir(valor, destino);
    }
}
