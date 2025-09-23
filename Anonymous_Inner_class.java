interface A{
    void show();
}

public class Anonymous_Inner_Class{
    public static void main(String[] args){

        A obj=new A()  //Anonymous Inner Class 
        {
            public void show(){
                System.out.println("In the show...");
            }

        };

        obj.show();
    }
}