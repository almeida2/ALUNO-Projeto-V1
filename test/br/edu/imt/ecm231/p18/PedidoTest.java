package br.edu.imt.ecm231.p18;

public class PedidoTest {
    public static void executar() {
        Pedido p = new Pedido("P1", 100);
        Teste.assertEquals(100, p.getValor(), "criacaoValida");
        Teste.assertFalse(p.isPago(), "novoNaoPago");
        Teste.assertThrows(IllegalArgumentException.class, () -> new Pedido("P2", 0), "valorInvalido");
    }
}
