
public class Q43 {
    public static void main(String[] args) {
        try {
            throwCustomException();
        } catch (MyException e) {
            System.out.println("Caught custom exception.");
            e.printMessage();
        }
    }

    public static void throwCustomException() throws MyException {
        throw new MyException("This is a custom exception message.");
    }
}



class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}
