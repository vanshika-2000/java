import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The No. of terms: ");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        if(n>0)
            System.out.print(a+" ");
        if(n>1)
            System.out.print(b+" ");
        for(int i=3; i<=n;i++){
                System.out.print((a+b)+" ");
                int temp=a;
                a=b;
                b=b+temp;
            }
        
        sc.close();
    }
}
