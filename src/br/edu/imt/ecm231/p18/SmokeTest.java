package br.edu.imt.ecm231.p18;

public class SmokeTest {
    public static void main(String[] a) {
        ControladorPedidos c = new ControladorPedidos();
        c.criarPedido("SMOKE", 50);
        boolean ok = c.pagarPedido("SMOKE", 50) && c.getPedido("SMOKE").isPago();
        System.out.println(ok ? "SMOKE TEST: SUCESSO" : "SMOKE TEST: FALHA");
        if (!ok)
            System.exit(1);
    }
}
