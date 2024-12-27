public class Student {

    private String name;
    private int test1, test2, finalExam;
    private double average;

    public Student() {
        name = "";
        test1 = 0;
        test2 = 0;
        finalExam = 0;
    }

    public Student(String name) {
        this.name = name;
        test1 = 0;
        test2 = 0;
        finalExam = 0;
    }

    public Student(String name, int test1, int test2, int finalExam) {
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.finalExam = finalExam;
    }

    public String toString() {
        return name + " has test grades " +
                test1 + ", " + test2 + ", " + finalExam +
                String.format(" and an average of %.3f", average);
    }

    public void setTest1(int t) {
        test1 = t;
    }

    public void setTest2(int t) {
        test2 = t;
    }

    public void setFinal(int finalExam) {
        this.finalExam = finalExam;
    }

    public void setGrades(int t1, int t2, int f) {
        test1 = t1;
        test2 = t2;
        finalExam = f;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTest1() {
        return test1;
    }

    public int getTest2() {
        return test2;
    }

    public int getFinal() {
        return finalExam;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        doAverage();
        return average;
    }

    private void doAverage() {
        average = (test1 + test2 + finalExam) / 3.0;
    }

}
