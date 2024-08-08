import java.util.ArrayList;

public class Program {

    public static void main(String[] args)
    {
        // this will only allow objects from classes that implement
        // IMovable

        //this is saying: create an array of class objects that implement
        // IMovable
        //anything that does NOT implement that interface
        // will NOT be allowed in this array
        ArrayList<IMovable> array = new ArrayList<>();

        Turtle turtle = new Turtle("Tim");
        Rabbit rabbit = new Rabbit("Rabbit");

//
//        String x = " ";
//
//        //this is not allowed because String does not IMPLEMENT IMovable
//        array.add(x);

        //this IS allowed because Turtle DOES implement IMovable...
        array.add(turtle);
        array.add(rabbit);

        for(IMovable instance: array){
            instance.getName();
        }

    }

}
