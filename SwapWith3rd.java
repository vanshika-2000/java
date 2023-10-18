public class SwapWith3rd {
    public static void main(String[] args) {
        int a = 20, b = 30, c;
        System.out.println("before Seap \na= " + a + "\nb= " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("after  Swap\na= " + a + "\nb= " + b);
    }
}
