public class DayOrNight {

    public static void main(String[] args) {

        boolean daytime, sunShining;

        sunShining = true;

        // basic condition test
        if (sunShining == true)
            daytime = true;
        else
            daytime = false;

        System.out.println("sunShining = " + sunShining);
        System.out.println("daytime = " + daytime);
    }
}
