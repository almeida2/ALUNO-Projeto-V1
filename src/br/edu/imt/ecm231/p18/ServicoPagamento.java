package br.edu.imt.ecm231.p18;

public class ServicoPagamento {
    public boolean processarPagamento(Pedido p, double recebido) {
        if (p == null)
            throw new IllegalArgumentException("Pedido obrigatório");
        if (p.isPago())
            return false;
        if (recebido >= p.getValor()) {
            p.marcarPago();
            return true;
        }
        return false;
    }
}
