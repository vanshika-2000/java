import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
      System.out.println("enter your weight in kilogram ");  
      Scanner s = new Scanner (System.in);
      float w = s.nextFloat();
      System.out.println("enter your height in meters");
      float h =  s.nextFloat();
      float bmi = w/(h*h);
      System.out.println("your body mass index is :" + bmi);
      if(bmi <= 18.5f)
      {
        System.out.println("you are undrweight");
      }
      else if (bmi>18.5f && bmi <=24.9f)
      {
        System.out.println("you are in the healthy weight range");
      }
      else if (bmi>24.9f && bmi <=29.9f)
      {
        System.out.println("you are in the ovrweight range");
      }
      else if (bmi > 29.9f){
        System.out.println("you are in the obese range");
      }
      s.close();
    }
    
}
