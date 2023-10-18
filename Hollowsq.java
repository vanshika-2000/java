import java.util.Scanner;

public class Hollowsq {
    public static void main(String[] args) {
        System.out.println("Enter the value of n ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
        s.close();    
    }
    
}
