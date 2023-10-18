
import java .util.Scanner;
public class Greatestofe {
    public static void main(String[]args){
        System.out.println("Enter three numbers ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a>b && a>c)
        {
            System.out.println("The graeatest number is :"+a);
        }
        else if(c>a && c>b)
        {
            System.out.println(" The greatest number is : "+c);
        }
        else
        {
            System.out.println("The greatest number is :" +b);
        }
        s.close();
    }
    
}
