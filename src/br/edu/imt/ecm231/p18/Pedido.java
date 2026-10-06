package br.edu.imt.ecm231.p18;

public class Pedido {
    private final String id;
    private double valor;
    private boolean pago;

    public Pedido(String id, double valor) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("ID obrigatório");
        if (valor <= 0)
            throw new IllegalArgumentException("Valor deve ser positivo");
        this.id = id;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    void marcarPago() {
        pago = true;
    }
}
