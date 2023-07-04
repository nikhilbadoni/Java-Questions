class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Person person = new Person("Akhi", 27);
        System.out.println(person.toString());
    }
}
