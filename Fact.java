import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        System.out.println(" Enter the number whose factorial has to be calculated");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("factorial og given number is :" + fact);
        s.close();
    }

}
