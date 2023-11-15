package Unit5;

// Have to get rid of package statement

public class Oven {
    // Represents the maximum possible temperature of an oven
    private int maxTemp;

    // Represents the current temperature of an oven
    private int currentTemp;

    // Constructs an oven with the given max temp and starting temp. The maximum
    // temperature of an oven must be greater than 0, but no more than 500.
    // The starting temperature should be less than or equal to the maximum t
    // temperature, but no less than 0.
    public Oven(int maxTemperature, int startTemperature) {
        if (maxTemperature > 500 || maxTemperature < 0) {
            maxTemperature = 500;
        }
        if (startTemperature > maxTemperature) {
            startTemperature = maxTemperature;
        } else if (startTemperature < 0) {
            startTemperature = 0;
        }

        maxTemp = maxTemperature;
        currentTemp = startTemperature;
    }

    // Returns the maximum temperature of an oven
    public int getMaxTemp() {
        return maxTemp;
    }

    // Returns the current temperature of an oven
    public int getCurrentTemp() {
        return currentTemp;
    }

    // Turns an oven off by setting the current temperature to 0.
    public void turnOff() {
        if (currentTemp > 0) {
            currentTemp = 0;
        }

    }

    // Returns whether the current temperature of an oven is greater than 0. Should
    // return false if the current temperature is 0.
    public boolean isOn() {
        if (currentTemp > 0) {
            return true;
        }
        return false;
    }

    // Sets the current temperature of an oven to the given value. Remember,
    // the current temperature should not exceed the max temp.
    public void preheat(int temp) {
        if (temp > 0) {
            if (temp > maxTemp) {
                currentTemp = maxTemp;
            } else {
                currentTemp = temp;
            }
        }

    }
}
