class A{

    public A(){
        super();  //By default it is present here implicitly
        System.out.println("Default Constructor of A");
    }

    public A(int a){
        super();  //By default it is present here implicitly
        System.out.println("Parameterized Constructor of A");
    }
}

class B extends A{

    public B(){
        
        super(3); //Parametrized constructor of A will be called

        System.out.println("Default Constructor of B");
    }

    public B(int b){

        this(); //It is used to call the default constructor of B

        System.out.println("Parametrized Constructor of B");
    }
}


public class Super_Method{
    public static void main(String[] args){

       // B b=new B();  //Default constructor of both the classes willbe called

       // B b1=new B(2); //Default constructor of A and parametrized constructor of B will be called

        B b2=new B(2);
    }
}