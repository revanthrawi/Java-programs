import java.util.*;

class Grandpa {
    private String grandpa;
    private String grandma;

    String setGrand(String g1, String g2) {
        this.grandpa = g1;
        this.grandma = g2;
        return "na";
    }
    //encapsulation here
    void printingsu(){
        System.out.println("Super ");
    }
    String getGrand() {
        return this.grandpa + " " + this.grandma;
    }
}

class Normal extends Grandpa {
    Scanner sc = new Scanner(System.in);
    String p1 = sc.nextLine();
    String p2 = sc.nextLine();
}

class Child extends Normal {
    String c1 = sc.nextLine();
    String c2 = sc.nextLine();
    //multilevel Inheritance
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grandpa gp = new Grandpa();

        String g1 = sc.nextLine();
        String g2 = sc.nextLine();
        gp.setGrand(g1, g2);
        gp.printingsu();
        System.out.println("Grand names are " + gp.getGrand());

        Normal n1 = new Child(); //instance creation and overriding (static polymorphism)
        // accessing inherited variables in the main class
        System.out.println("Parent names are " + n1.p1 + " " + n1.p2);
        System.out.println("Child names are " + ((Child) n1).c1 + " " + ((Child) n1).c2);
    }
}