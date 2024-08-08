import java.awt.*;

public interface IMovable {

    //THESE ARE IMPLICITLY ABSTRACT METHODS:
    Point move(int xUnits, int yUnits);
    void goHome();

    void newMethod();

    String getName();
}
