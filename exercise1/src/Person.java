public class Person {

    private String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = -1;
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

        if (this.salary == -1) {
            System.out.println("Salary not provided");
        } else {
            System.out.println("Salary: " + this.salary);
        }
    }
}
