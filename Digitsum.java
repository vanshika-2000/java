import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        System.out.println("Enter the number to sum the digits");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(" the sum of digit is :" + sum);
        s.close();
    }

}
