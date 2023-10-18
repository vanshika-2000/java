
import java.util.Scanner;
public class Temp {
    public static void main (String[] args){
        System.out.println("Want to change temperature?\n choose one option\n 1.celcius to fahrenheit\n 2.celcius to kelvin\n 3. fahrenheitto celsius\n 4. fahrenheit to kelvin \n 5.kelvin to celcius\n 6.kelvin to fahrenheit");
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        switch (a)
        {
            case 1:
            {
                System.out.println("enter temperature in celcius");
                //Scanner s1 =new Scanner (System.in);
                float c = s . nextInt();
                float fh = (c *(9/5f)) + 32f;
                System.out.println( " the temperature in fahrenheit is "+ fh );
                break;
            }
             case 2:
            {
                System.out.println("enter temperature in celcius");
                //Scanner s1 =new Scanner (System.in);
                float c = s . nextInt();
                float k = c + 273.15f ;
                System.out.println( " the temperature in kelvin is "+ k );
                break;
            }
            case 3:
            {
                System.out.println("enter temperature in fahrenheit");
                //Scanner s1 =new Scanner (System.in);
                float fh = s . nextInt();
                float c = (fh - 32f) *(5/9f);
                System.out.println( " the temperature in celcius is "+ c );
                break;
            }
            case 4:
            {
                System.out.println("enter temperature in fahrenheit");
                //Scanner s1 =new Scanner (System.in);
                float fh = s . nextInt();
                float k = (fh- 32f)*(5/9f) + 273.15f;
                System.out.println( " the temperature in kelvin is "+ k );
                break;
            }
            case 5:
            {
                System.out.println("enter temperature in kelvin");
                //Scanner s1 =new Scanner (System.in);
                float k = s . nextInt();
                float c = k - 273.15f;
                System.out.println( " the temperature in celcius is "+ c );
                break;
            }
            case 6:
            {
                System.out.println("enter temperature in kelvin");
                //Scanner s1 =new Scanner (System.in);
                float k = s . nextInt();
                float fh = (k-273.15f)*(9/5f)+32;
                System.out.println( " the temperature in fahrenheit is "+ fh );
                break;
            }
            
           
            

        }
        s.close();

    }
    
}
