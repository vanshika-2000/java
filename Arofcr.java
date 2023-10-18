
import java.util. Scanner;
public class Arofcr {
    public static void main(String[]args){
        System.out.println("Enter the radius of circle");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        float ar = 3.14f * r *r;
        System.out.println(" The area of circle is :"+ar);
        s.close();
    }
    
}
