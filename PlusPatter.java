import java.util.Scanner;

public class PlusPatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows: ");
        int n = sc.nextInt();
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < n; j++) {
                if (i == n)
                    System.out.print("++");
                else
                    System.out.print(" ");
            }
            System.out.print("+");
            System.out.println();
        }
        sc.close();
    }
}
