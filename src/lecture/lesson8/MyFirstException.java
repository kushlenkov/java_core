package lecture.lesson8;

public class MyFirstException extends Exception {
    public static int countExceptions = 0;

    public static int getCountExceptions() {
        return countExceptions;
    }

    public MyFirstException() {
        countExceptions++;
    }

    public MyFirstException(String message) {
        super(message);
        countExceptions++;
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
        countExceptions++;
    }

    public MyFirstException(Throwable cause) {
        super(cause);
        countExceptions++;
    }
}
