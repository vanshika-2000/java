
import java.util.Scanner;
public class Leap {
    public static void main( String[] args){
        System.out.println("enter a year to check whether given year is leap year or not");
        Scanner s = new Scanner( System.in);
        int yr = s.nextInt();
        if ( yr % 4 == 0 && yr % 400 == 0 && yr % 100 == 0)
        {
            System.out.println(" is a leap year");
        }
        else
        {
            System.out.println( " is not a leap year");
        }
        s.close();
    } 
    
}
