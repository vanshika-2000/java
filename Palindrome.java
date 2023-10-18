import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter a number to check for palindrome");
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = a ;
        int sum=0;
        while(b>0)
        {
            int r=b%10;
            sum = (sum *10 )+r ;
            b=b/10;
        }
        System.out.println("entered value :" +a);
        System.out.println("rev : "+sum);
        if (sum==a)
        {
            System.out.println("The enterd number is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        s.close();
    }
    
    
}
