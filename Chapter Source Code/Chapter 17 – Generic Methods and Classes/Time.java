public class Time implements Cloneable, Comparable {

    int hours, minutes, seconds;

    public Time (int hr, int min, int sec) {
        hours = hr;
        minutes = min;
        seconds = sec;
    }

    public Object clone() {
        Time dup;
        try {
            dup = (Time) super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }

        return dup;
    }

    public int compareTo(Object otherTime) {
        int delta;
        Time t = (Time) otherTime;

        delta = hours - t.hours;
        if (delta != 0)
            return delta;

        delta = minutes - t.minutes;
        if ( delta != 0)
            return delta;

        return seconds - t.seconds;
    }

    public boolean equals(Object otherTime) {
        Time t = (Time) otherTime;
        return hours == t.hours && minutes == t.minutes && seconds == t.seconds;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
