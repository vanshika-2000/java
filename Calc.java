import java.util.Scanner;
public class Calc{
    public static void main (String[]args){
        System.out.println("Enter input to perform operation");
         Scanner s = new Scanner (System.in);
        int a =s.nextInt();
        int b =s.nextInt();
       
        System.out.println("Want to calculate?\n click ");
        System.out.println("1. for Addition ");
        System.out.println("2. for Substraction");
        System.out.println("3. for Multiplication ");
        System.out.println("4. for Division ");
       
        int op = s. nextInt();
       
        switch(op)
        {
            case 1:
            {
                int add = a+b;
                System.out.println("the addition of "+ a +"and "+b+ " is :"+add );
                break;
            }
            case 2:
            {
                int sub = a-b;
                System.out.println("the substraction of "+ a +"and "+b+ " is :"+sub );
                break;
            }
            case 3:
            {
                int mul = a*b;
                System.out.println("the multiplication of "+ a +"and "+b+ " is :"+mul);
                break;
            }
            case 4:
            {
                float div = a/b;
                System.out.println("the division of "+ a +"and "+b+ " is :"+div );
                break;
            }
            default:
            {
                System.out.println("invalid choice");
                break;
            }
        }
        s.close();

    }
}