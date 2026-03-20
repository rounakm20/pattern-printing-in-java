class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class CylinderSurfaceAreaVolume {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();

        myCylinder.setHeight(12);
        myCylinder.setRadius(9);

        System.out.println("The Surface Area of the Cylinder is: " + myCylinder.surfaceArea());
        System.out.println("The Volume of the Cylinder is: " + myCylinder.volume());
    }
}
