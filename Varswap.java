

import java.util.Scanner;

public class Varswap {
    public static void main(String[] args) {
        System.out.println("enter the values to be swap :");
        Scanner s = new Scanner(System.in);

        float a = s.nextInt();
        float b = s.nextInt();
        System.out.println("before swapping a = " + a + "and b = " + b);
        a = (a / b);
        b = (a * b);
        a = (b / a);
        System.out.println("after swapping a = " + a + "and b = " + b);
        s.close();
    }

}
