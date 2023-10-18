import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println(" Enter a number to check for prime number  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 2; i < n; i++) {

            if (n % i == 0) {
                System.out.println("not prime");
                break;
            }
        }
        if (i >= n) {
            System.out.println("prime number");

        }
        if (n == 2) {
            System.out.println(" prime number ");

        }

        sc.close();
    }

}
