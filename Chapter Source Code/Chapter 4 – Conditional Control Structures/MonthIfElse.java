import java.util.Scanner;

public class MonthIfElse {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int month;
        String monthStr;

        // get month selection as a number.
        System.out.print("Enter the month (1-12): ");
        month = kb.nextInt();

        // large multi-way test to get String.
        if ( month == 1 )
            monthStr = "January";
        else if ( month == 2 )
            monthStr = "February";
        else if ( month == 3 )
            monthStr = "March";
        else if ( month == 4 )
            monthStr = "April";
        else if ( month == 5 )
            monthStr = "May";
        else if ( month == 6 )
            monthStr = "June";
        else if ( month == 7 )
            monthStr = "July";
        else if ( month == 8 )
            monthStr = "August";
        else if ( month == 9 )
            monthStr = "September";
        else if ( month == 10 )
            monthStr = "October";
        else if ( month == 11 )
            monthStr = "November";
        else if ( month == 12 )
            monthStr = "December";
        else
            monthStr = "AN UNKNOWN MONTH";

        System.out.println("The month selected is " + monthStr);
    }
}
