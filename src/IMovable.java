import java.awt.*;

public interface IMovable {

    //THESE ARE IMPLICITLY ABSTRACT METHODS:
    Point move(int xUnits, int yUnits);
    void goHome();

    void newMethod();

    String getName();

   default void getSize()
   {
       System.out.println("This will get the size.");
   }
}
