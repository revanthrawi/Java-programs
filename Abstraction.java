import java.util.*;
abstract class C1 {
    abstract void parent(); // Abstract method in abstract class & should not contain any body within
}
interface Ayo {
    // Interface also //only declaration
    void setValues(String a, String b); //setter
}
class Abst extends C1 implements Ayo {
    private String a;
    private String b;
    void parent() //overriding method
    {
        System.out.println("Yo");
        System.out.println("Values from Ayo interface: " + a + ", " + b);
    }
    //overriding setter
    public void setValues(String a, String b) {
        this.a = a;
        this.b = b;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Abst ab = new Abst();
        ab.setValues("Hello", "World"); // Setting values using Ayo interface method
        ab.parent();
    }
}
