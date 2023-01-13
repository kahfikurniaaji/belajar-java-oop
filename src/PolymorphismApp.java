public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Kahfi");
        employee.sayHello("budi");

        employee = new Manager("Kahfi");
        employee.sayHello("budi");

        employee = new VicePresident("Kahfi");
        employee.sayHello("budi");

        sayHello(new Employee("Kahfi"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));

    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice President " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
