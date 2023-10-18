import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.println("Enter the current amount in your account");
        Scanner s = new Scanner(System.in);
        float amt = s.nextFloat();
        System.out.println("Enter the amount to be ");
        System.out.println(" 1. Check bank balance");
        System.out.println(" 2. Deposite money ");
        System.out.println(" 3. Withdraw money");
        int choice = s .nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Your bank balance is =" + amt);
                break;
            }
            case 2: {
                System.out.println("Enter the amt to be deposited ");
                float dep = s.nextFloat();
                System.out.println("your bank balance is " + (amt + dep));
                break;
            }
            case 3: {
                System.out.println("Enter about to be withdrawn");
                float wd = s.nextFloat();
                System.out.println("your bank balance is " + (amt - wd));
                break;
            }
            default: {
                System.out.println("INVALID CHOICE");
            }
        }
        s.close();
    }

}
