public class Time implements Cloneable, Comparable<Time> {

    int hours, minutes, seconds;

    public Time(int hr, int min, int sec) {
        hours = hr;
        minutes = min;
        seconds = sec;
    }

    public Time clone() {
        Time dup;
        try {
            dup = (Time) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }

        return dup;
    }

    public int compareTo(Time otherTime) {
        int delta;
        Time t = otherTime;

        delta = hours - t.hours;
        if (delta != 0)
            return delta;

        delta = minutes - t.minutes;
        if (delta != 0)
            return delta;

        return seconds - t.seconds;
    }

    public boolean equals(Time otherTime) {
        Time t = otherTime;
        return hours == t.hours && minutes == t.minutes && seconds == t.seconds;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

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
