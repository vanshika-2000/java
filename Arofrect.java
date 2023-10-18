
import java.util.Scanner;
 public class Arofrect {
    public static void main(String [] args){
        System.out.println("Enter the length and then breadth of rectangle");
        Scanner s= new Scanner(System.in);
        float l = s. nextFloat();
        float b = s. nextFloat();
        float ar = (l* b) ;
        System.out.println("The area of rectangle is :"+ar);
        s.close();
    }
 }
