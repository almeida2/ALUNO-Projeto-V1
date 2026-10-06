package br.edu.imt.ecm231.p18;

public final class Teste {
    private Teste() {

    }

    public static void assertTrue(boolean c, String n) {
        if (!c)
            fail(n);

    }

    public static void assertFalse(boolean c, String n) {
        if (c)
            fail(n);

    }

    public static void assertEquals(double e, double o, String n) {
        if (Math.abs(e - o) > .0001)
            fail(n);
    }

    public static void assertThrows(Class<? extends Throwable> t, Runnable a, String n) {
        try {
            a.run();
        } catch (Throwable e) {
            if (t.isInstance(e))
                return;
            fail(n);
        }
        fail(n);
    }

    private static void fail(String n) {
        throw new AssertionError(n);

    }
}
