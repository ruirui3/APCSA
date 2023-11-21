package Unit5;

// Have to get rid of package statement

public class Rectangle {
    private double base = 1.0;
    private double height = 1.0;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double bs, double ht) {
        setBase(bs);
        setHeight(ht);
    }

    public boolean equals(Rectangle other) {
        boolean sameHeight = this.height == other.height;
        boolean sameBase = this.base == other.base;

        return sameBase && sameHeight;
    }

    public double getArea() {
        return base * height;
    }

    public double getBase() {
        return base;
    }

    public double getDiagonal() {
        return Math.sqrt(base * base + height * height);
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        return base + base + height + height;
    }

    public void setBase(double bs) {
        if (!(bs > 0.0))
            return;

        base = bs;
    }

    public void setHeight(double ht) {
        if (!(ht > 0.0))
            return;

        height = ht;
    }

    public String toString() {
        return "rectangle with base " + base + ", height " + height;
    }
}
