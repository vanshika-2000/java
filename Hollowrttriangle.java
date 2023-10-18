import java.util.Scanner;

public class Hollowrttriangle {
     public static void main(String[] args) {
        System.out.println("enter number of rows");
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                if(i==j||j==1||i==5){
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
