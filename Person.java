package constructeroverloading;

public class Person {
    private String name;
    private int age;

    public String getName() { // getter method-var name=cap_(start letter)
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Person() {
        this.name = "jaya";
        this.age = 20;
    }

    public Person(String name) {
        this.name = name;
        this.age = 20;
    }

    public Person(int age) {
        this.name = "sony";
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("p name is: " + p.getName() + " and age is: " + p.getAge());

        Person p1 = new Person("Jhon");
        System.out.println("p1 name is: " + p1.getName() + " and age is: " + p1.getAge());

        Person p2 = new Person(24);
        System.out.println("p2 name is: " + p2.getName() + " and age is: " + p2.getAge());

        Person p3 = new Person("Honey", 23);
        System.out.println("p3 name is: " + p3.getName() + " and age is: " + p3.getAge());

    }
}
