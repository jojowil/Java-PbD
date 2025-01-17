public class CloneEx1 {

    public static class MyClass implements Cloneable {
        String s; // immutable String
        int a, b; // primitive types

        public MyClass(String s, int a, int b) {
            this.s = s;
            this.a = a;
            this.b = b;
        }

        public Object clone() {
            MyClass dup;

            try {
                dup = (MyClass) super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }

            return dup;
        }
    }

    public static void main(String[] args) {
        MyClass orig, copy;

        orig = new MyClass("Computer", 6, 24);
        copy = (MyClass) orig.clone();
    }
}
