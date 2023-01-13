package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Kahfi", "Kurnia", "Aji"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throw new RuntimeException(throwable);
        }
    }
}
