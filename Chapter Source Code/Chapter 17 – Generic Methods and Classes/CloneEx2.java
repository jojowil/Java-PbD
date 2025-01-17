public class CloneEx2 {

    public static class MyClass implements Cloneable {
        String s; // immutable String
        int ia[]; // array class object

        public MyClass(String s, int len) {
            this.s = s;
            ia = new int[len];
        }

        public Object clone() {
            MyClass dup;

            try {
                dup = (MyClass) super.clone();
                dup.ia = (int[]) ia.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }

            return dup;
        }
    }

    public static void main(String[] args) {
        MyClass orig, copy;

        orig = new MyClass("Grades", 50);
        copy = (MyClass) orig.clone();
    }
}
