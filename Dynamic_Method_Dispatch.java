class A{
    
    public void show(){
        System.out.println("In A's show method");
    }

}

class B extends A{

    //Method Overriding
    public void show(){
        System.out.println("In B's show method");
    }

}

public class Dynamic_Method_Dispatch{
    public static void main(String[] args){

        A obj; //Referenc of the object is of type A

        obj=new A(); //Object is of type A

        obj.show(); //Output: in A's show method

        obj=new B(); //Object of type B

        obj.show(); //Output: In B's show method
    }
}