public class DataFormatException extends Exception {
    public DataFormatException () {
        super("Data must contain at least one colon");
    }

    public DataFormatException(String msg) {
        super(msg);
    }
}
