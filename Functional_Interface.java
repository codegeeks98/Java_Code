//By giving the annotation here, we are making sure that the compiler
//gives us the error if we try to declare more than one abstarct method in here

@FunctionalInterface
interface A{
    void show(); //declaration of the abstract method
}

class B implements A{

    public void show(){
        System.out.println("In show method...");
    }
}

public class Functional_Interface{
    public static void main(String[] args){

        B obj = new B();

        obj.show();

    }
}