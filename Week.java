import java.util.Scanner;
public class Week {
    public static void main(String[] args) {
        System.out.println("check for weekend and weekday here");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");
        Scanner s = new Scanner(System.in);
        int day=s.nextInt();
        switch(day)
        {
            case 1:
            {
            System.out.println("WEEKDAY ");
            break;
            }
             case 2:
            {
            System.out.println("WEEKDAY ");
            break;
            }
            case 3:
            {
            System.out.println("WEEKDAY ");
            break;
            }
            case 4:
            {
            System.out.println("WEEKDAY ");
            break;
            }
            case 5:
            {
            System.out.println("WEEKDAY ");
            break;
            }
            case 6:
            {
            System.out.println("WEEKEND ;) ");
            break;
            }
            case 7:
            {
            System.out.println("WEEKEND ;) ");
            break;
            }
            default:
            {
                System.out.println("INVALID CHOICE");
            }            

        }
        s.close();
    }
    
}
