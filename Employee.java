class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public void displayEmployee() {
        super.display();  // Calling superclass display() method
        System.out.println("Employee ID: " + employeeId);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Akhi", 27, "EMP001");
        employee.displayEmployee();
    }
}

