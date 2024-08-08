import java.awt.*;

public class Turtle implements IMovable, Interface2 {
    private String name;
    private Point currentLocation;

    private final int power;

    @Override
    public void someMethod() {
        System.out.println("test");
    }

    public Turtle(String name) {
        this.name = name;
        this.currentLocation = new Point(25, 25);
        this.power = 100;
    }

// getters and setters not shown

    public Point move(int xUnits, int yUnits) {

        // the turtle moves the number of units specified in
        // the direction specified

        currentLocation.setLocation(currentLocation.getX() + xUnits,currentLocation.getY() + yUnits );

        return currentLocation;
    }

    public void goHome() {
        this.currentLocation = new Point(25, 25);
    }

   public void newMethod() {
        System.out.println("hello world");
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

}
