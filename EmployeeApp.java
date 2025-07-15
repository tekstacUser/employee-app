public class EmployeeApp {
    public static void main(String[] args) {
        String name = System.getProperty("name");
        String department = System.getProperty("department");
        String salary = System.getProperty("salary");

        System.out.println("Employee " + name + " from " + department + " earns ₹" + salary + ".");
    }
}
