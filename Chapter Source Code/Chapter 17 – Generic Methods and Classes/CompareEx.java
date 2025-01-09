public class CompareEx {
    public static void main(String[] args) {
        Time clock1, clock2, copyof2;
        clock1 = new Time(11, 57, 0); // 11:57:00am
        clock2 = new Time(14, 0, 0); // 2:00:00pm
        copyof2 = (Time) clock2.clone();

        if (clock1.compareTo(clock2) > 0)
            System.out.println(clock1 + " is later than " + clock2);
        else if (clock1.compareTo(clock2) < 0)
            System.out.println(clock1 + " is earlier than " + clock2);

        if (clock2.equals(copyof2))
            System.out.println("clock2 and copyof2 are equal");
    }
}
