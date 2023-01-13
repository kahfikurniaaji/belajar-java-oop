package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Kahfi";
        first = first + " " + "Aji";

        System.out.println(first);

        String second = "Kahfi Aji";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Kahfi Aji";

        System.out.println(second == third);
        System.out.println(second.equals(third));

    }
}
