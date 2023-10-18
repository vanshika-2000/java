import java.util.Scanner;

public class Traaffic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Red");
        System.out.println("2.Yellow");
        System.out.println("3.Green");
        System.out.print("Enter Pattern: ");
        int ch = sc.nextInt();
        switch(ch%100){
            case 1:
                System.out.println("Yellow");
                break;
            case 2:
                System.out.println("Green or Red");
                break;
            case 12:
                System.out.println("Green");
                break;
            case 23:
                System.out.println("Yellow");
                break;
            case 21:
                System.out.println("Yellow");
                break;
            default:
                System.out.println("Wrong Pattern");
        }
        sc.close();
    }
    
}
