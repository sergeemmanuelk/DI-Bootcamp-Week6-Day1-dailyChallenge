public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println("person1");
        person1.displayInfo();

        Person person2 = new Person("Serge KONAN", 27, 130000.0);
        System.out.println("Person 2");
        person2.displayInfo();

        Person person3 = new Person("Marie Emmanuelle", 20);
        System.out.println("Person 3");
        person3.displayInfo();
    }
}