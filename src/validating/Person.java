package validating;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (this.name == null || this.name.equals("") || this.name.length() > 40 || this.age >= 0 && this.age <= 120) {
            throw new IllegalArgumentException("Try again bro!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
