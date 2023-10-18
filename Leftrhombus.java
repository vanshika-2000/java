import java.util.Scanner;

public class Leftrhombus {
    public static void main(String[] args) {
    System.out.println("enter the number of rows");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i =n;i>=0;i--)
    {
        for( int j = 1; j<=i ;j++)
        {
            System.out.print("  ");
        }
        for (int k =1;k<=n;k++)

        {
            System.out.print("* ");
        }
        System.out.println();
    }
    s.close();
 }   

}
