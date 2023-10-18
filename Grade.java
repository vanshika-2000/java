import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 90 && a <= 100) {
            System.out.println(" grade A");
        } else if (a < 90 && a >= 85) {
            System.out.println("grade B");
        } else if (a < 85 && a >= 65) {
            System.out.println("grade C");
        } else if (a < 65 && a >= 45) {
            System.out.println("grade D");
        } else if (a < 45 && a >= 30) {
            System.out.println("grade E");
        } else {
            System.out.println("fail");
        }
        sc.close();
    }

}
