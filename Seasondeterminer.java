import java.util.Scanner;

public class Seasondeterminer {
    public static void main(String[] args) {
        System.out.println("Enter month name to determine the season");

        Scanner s = new Scanner(System.in);
        String month = s.next().trim().toLowerCase();
        switch (month) {
            case "october":
            case "november":
            case "december":
            case "january": {
                System.out.println(" winter season ");
                break;
            }
            case "feburary":
            case "march": {
                System.out.println("autum season");
                break;
            }
            case "april":
            case "may": {
                System.out.println("spring season ");
                break;
            }
            case "june":
            case "july":
            case "augest":
            case "september": {
                System.out.println("summer season");
                break;
            }

        }
        s.close();

    }

}
