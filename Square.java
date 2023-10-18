import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        System.out.println("Enter the value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        } 
        s.close();    
    }
    
}
