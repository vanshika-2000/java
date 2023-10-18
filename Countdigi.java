import java.util.Scanner;
public class Countdigi{
    public static void main(String[] args) {
        System.out.println(" Enter the number ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("number of digit in given number is :"+count);
        s.close();
    }
}