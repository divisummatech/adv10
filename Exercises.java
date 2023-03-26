package javaoopadvanced._3;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        @Override
        public String toString() {
            return String.format("Name: %s, Age: %d, Address: %s", name, age, address);
        }
    }

    Person person1 = new Person("John", 30, "123 Main St");
    Person person2 = new Person("Jane", 25, "456 Elm St");

    System.out.println(person1.toString());
    System.out.println(person2.toString());
}
    }

/**
 * 2:
 *
 *
 * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
 *
 * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
 *
 * Create 2 people and print out their hashcodes
 */
private static void exercise2() {
        System.out.println("\nExercise 1: ");
        clast Person {
private String name;
private int age;
private String address;

public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        }

// faccio override
@Override
public int hashCode() {
        return name.hashCode() + Integer.hashCode(age) + address.hashCode();
        }
        }

public class Main {
    public static void main(String[] args) {
        System.out.println("\nExercise 2: ");


        Person person1 = new Person("Marco", 28, "Corso nizza 12");
        Person person2 = new Person("Paolo", 29, "Via Roma 121");

        System.out.println("Person 1 hashcode: " + person1.hashCode());
        System.out.println("Person 2 hashcode: " + person2.hashCode());
    }
}

    }