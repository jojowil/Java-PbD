import java.util.Scanner;

public class MonthSelect {

    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {

        int month;
        String monthStr;

        System.out.print("Enter the month (1-12): ");
        month = kb.nextInt();

        switch ( month ) {
            case 1: monthStr = "January"; break;
            case 2: monthStr = "February"; break;
            case 3: monthStr = "March"; break;
            case 4: monthStr = "April"; break;
            case 5: monthStr = "May"; break;
            case 6: monthStr = "June"; break;
            case 7: monthStr = "July"; break;
            case 8: monthStr = "August"; break;
            case 9: monthStr = "September"; break;
            case 10: monthStr = "October"; break;
            case 11: monthStr = "November"; break;
            case 12: monthStr = "December"; break;
            default: monthStr = "AN UNKNOWN MONTH"; break;
        }

        System.out.println("The month selected is " + monthStr);
    }
}
