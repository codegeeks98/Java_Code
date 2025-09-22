interface A{

    int age=44;
    String name="Aditya";

    void method1();  //public abstarct method
    void method2();  //public abstarct method

}

interface B{

    void method3(); //public abstarct method

}

class Demo implements A,B{  //Implpementation of "Mutiple Inheritance"

    public void method1(){
        System.out.println("Indside method1...");
    }

    public void method2(){
        System.out.println("Inside method2...");
    }

    public void method3(){
        System.out.println("Inside method3...");
    }
}

public class Multiple_Inheritance{
    public static void main(String[] args){

        Demo obj=new Demo();

        obj.method1();
        obj.method2();
        obj.method3();

    }
}