

import java.util.Scanner;

public class Vow {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the character to check whether it is a vowel or a consonent");
        String alpha = s.nextLine();
        if (alpha == "a") {
            System.out.println("its a vowel");
        } else if (alpha == "e") {
            System.out.println("its a vowel");
        } else if (alpha == "i") {
            System.out.println("its a vowel");
        } else if (alpha == "o") {
            System.out.println("its a vowel");
        } else if (alpha == "u") {
            System.out.println("its a vowel");
        } else {
            System.out.println("given character is consonent");
        }
        s.close();
    }

}
