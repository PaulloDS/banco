public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Conta contaCorrente = new ContaCorrente("123", 1000.0, 5.0);
        Conta contaPoupanca = new ContaPoupanca("456", 2000.0, 0.02);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        System.out.println("Saldo CC: " + contaCorrente.getSaldo());
        System.out.println("Saldo CP: " + contaPoupanca.getSaldo());

        contaCorrente.depositar(200.0);
        System.out.println("Saldo CC após depósito: " + contaCorrente.getSaldo());

        banco.transferir("123", "456", 100.0);
        System.out.println("Saldo CC após transferência: " + contaCorrente.getSaldo());
        System.out.println("Saldo CP após transferência: " + contaPoupanca.getSaldo());

        ((ContaPoupanca) contaPoupanca).aplicarJuros();
        System.out.println("Saldo CP após aplicar juros: " + contaPoupanca.getSaldo());
    }
}
