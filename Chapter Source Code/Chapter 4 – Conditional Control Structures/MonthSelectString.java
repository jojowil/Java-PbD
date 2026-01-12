import java.util.Scanner;

public class MonthSelectString {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int month;
        String monthStr;

        System.out.print("Enter a month: ");
        // note the chaining of methods to get a word
        // and convert to upper case at the same time.
        monthStr = kb.next().toUpperCase();

        switch ( monthStr ) {
            case "JANUARY": month = 1; break;
            case "FEBRUARY": month = 2; break;
            case "MARCH": month = 3; break;
            case "APRIL": month = 4; break;
            case "MAY": month = 5; break;
            case "JUNE": month = 6; break;
            case "JULY": month = 7; break;
            case "AUGUST": month = 8; break;
            case "SEPTEMBER": month = 9; break;
            case "OCTOBER": month = 10; break;
            case "NOVEMBER": month = 11; break;
            case "DECEMBER": month = 12; break;
            default: month = 0; break;
        }

        System.out.println("The month selected is " + monthStr);
    }
}
