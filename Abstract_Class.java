abstract class Car{

    int age=22;
    String name="Aditya";

    public abstract void run(); //Abstract method

    public void playMusic()     //Concrete method
    {
        System.out.println("Music is playing...");
    }

}

class WagonR extends Car{

    public void run()  //Implementation of the abstarct method
    {
        System.out.println("The Car is runnning...");
    }
}


public class Abstract_Class{
    public static void main(String[] args){

        Car c=new WagonR();

        c.run();

        c.playMusic();

        System.out.println("Name : "+c.name+" Age : "+c.age);


    }
}