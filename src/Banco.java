import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas;

    public Banco() {
        this.contas = new HashMap<>();
    }

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta getConta(String numero) {
        return contas.get(numero);
    }

    public boolean transferir(String numeroOrigem, String numeroDestino, double valor) {
        Conta origem = getConta(numeroOrigem);
        Conta destino = getConta(numeroDestino);
        if (origem != null && destino != null) {
            return origem.transferir(valor, destino);
        }
        return false;
    }
}

