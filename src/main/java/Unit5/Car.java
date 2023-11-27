package Unit5;

// Have to get rid of package statement

public class Car {

    private String make;
    private String model;
    private int year;
    private double mpg;
    private int id;
    private static int CarCount;

    public Car() {
        this("None", "None", 2000, 0);
    }

    public Car(String make, String model, int year, double mpg) {
        if (year < 1885)
            year = 2000;
        else if (year > 2022)
            year = 2022;

        if (mpg < 0)
            mpg = 0;

        this.make = make;
        this.model = model;
        this.year = year;
        this.mpg = mpg;
        this.id = CarCount + 1;
        CarCount++;
    }

    public String toString() {
        return "ID: " + id + "\n" + //
                "Make: " + make + "\n" + //
                "Model: " + model + "\n" + //
                "Year: " + year + "\n" + //
                "MPG: " + mpg;
    }
}
