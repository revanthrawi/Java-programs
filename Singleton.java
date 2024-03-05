public class Singleton {
    private static Singleton var1; //1. creating a static private variable
    //private static Singleton var1 = new Singleton(); -- This is Early Instantiation --declaration, instantiation, loading done in 1 step
    private Singleton()//2. creating a private constructor
    {
        System.out.println("Singleton if created - confirmed");
    }
    public static Singleton getSingl() // 3. creating a public constructor to access private by checking and creating instance in here
    {
        if(var1 == null) //lazy initialization che  ck - creation of instance when required
        {
            var1 = new Singleton();
        }
        return var1;
    }
    public void message() //--singleton check method
    {
        System.out.println("Yes");
    }
    public static void main(String[] args){
        Singleton s1 = Singleton.getSingl();
        s1.message();
        Singleton s2 = Singleton.getSingl();
        s2.message();
        if(s1==s2){
            System.out.println("Same ref"); //both objects referring to same instance (purpose of singleton)
        }
    }
}

