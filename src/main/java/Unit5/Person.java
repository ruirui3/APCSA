package Unit5;

// Have to get rid of package statement

public class Person {
    String firstName;
    String lastName;
    int age;
    String ssn;

    public Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Math.abs(age);
        this.ssn = ssn;
    }

    public String toString() {
        String toStrString = "SSN: " + ssn + "\n" +
                "\tName: " + firstName + " " + lastName + "\n" +
                "\tAge: " + age;

        return toStrString;
    }
}
