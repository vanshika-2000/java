import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        System.out.println(
                "Enter a number \n1 for monday\n2 for tuesday\n3 for wednesday\n4 for thursday\n5 for friday\n6 for saturday\n7 for sunday");
        Scanner s = new Scanner(System.in);
        int day = s.nextInt();
        switch (day) {
            case 1: {
                System.out.println("Today is Monday");
                break;
            }
            case 2: {
                System.out.println("Today is Tuesday");
                break;
            }
            case 3: {
                System.out.println("Today is Wednesday");
                break;
            }
            case 4: {
                System.out.println("Today is Thursday");
                break;
            }
            case 5: {
                System.out.println("Today is Friday");
                break;
            }
            case 6: {
                System.out.println("Today is Saturday");
                break;
            }
            case 7: {
                System.out.println("Today is Sunday");
                break;
            }
        }
        s.close();
    }

}
