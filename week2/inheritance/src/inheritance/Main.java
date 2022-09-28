package inheritance;

public class Main {
    public static void main(String[] args) {
        Customer costumer = new Customer();
        costumer.firstName = "Emre";
        System.out.println( costumer.firstName);

        Employee employee = new Employee();
        employee.firstName = "Engin";
        System.out.println(employee.firstName);

        CustomerManager customerManager = new CustomerManager();
        customerManager.List();
    }
}
