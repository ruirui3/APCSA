package Unit5;

// Have to get rid of package statement

public class Plane {

    private int location;

    Plane() {
        location = 0;
    }

    Plane(int loc) {
        this();
        if (-2000 <= loc && loc <= 2000) {
            location = loc;
        }
    }

    public void upward() {
        if (location + 100 > 2000) {
            location = 2000;
        } else {
            location += 100;
        }
    }

    public void downward() {
        if (location - 100 < -2000) {
            location = -2000;
        } else {
            location -= 100;
        }
    }

    public int getLocation() {
        return location;
    }

    public String toString() {
        String s = "";
        int numOfSpaces = (location + 2000) / 100;

        for (int i = 0; i < numOfSpaces; i++) {
            s += " ";
        }
        s += "@";

        return s;
    }
}