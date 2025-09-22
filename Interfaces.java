interface A{

    int age=22;  //These variables are by default "public, static & final"

    String name="Aditya Singh"; //These variables are by default "public, static & final"

    void show();  //by default these methods are "public abstract"

    void config(); //by default these methods are "public abstract"
}

class B implements A{

    public void show() //Implemenation of the abstract methods
    {
        System.out.println("In the show...");
    }

    public void config() //Implemenation of the abstract methods
    {
        System.out.println("In the config...");
    }
}

public class Interfaces{
    public static void main(String[] args){

        B obj=new B();

        obj.show();
        obj.config();

        System.out.println("Name- "+obj.name+", Age- "+obj.age);


    }
}