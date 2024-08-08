import java.awt.*;

public class Rabbit implements IMovable{

    private String name;
    private Point currentLocation;


    public Rabbit(String name) {
        this.name = name;
        this.currentLocation = new Point(25, 25);
    }

// getters and setters not shown

    public Point move(int xUnits, int yUnits) {

        // the turtle moves the number of units specified in
        // the direction specified

        currentLocation.setLocation(currentLocation.getX() + xUnits,currentLocation.getY() + yUnits );

        System.out.println ("I am a rabbit and i move differently than a turtle");
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
