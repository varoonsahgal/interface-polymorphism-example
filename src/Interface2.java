public interface Interface2 {
    void someMethod();

    default void getSize()
    {
        System.out.println("This will get the size.");
    }

}
