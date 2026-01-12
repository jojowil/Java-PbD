public class DayOrNight2 {

    public static void main(String[] args) {
        boolean daytime, nighttime, sunShining;

        sunShining = true;

        // if test with compound statement.
        if ( sunShining == true ) {
            daytime = true;
            nighttime = false;
        } else {
            daytime = false;
            nighttime = true;
        }

        System.out.println("sunShining = " + sunShining);
        System.out.println("daytime = " + daytime);
        System.out.println("nighttime = " + nighttime);
    }
}
