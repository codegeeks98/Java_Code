interface A{
    void show();
}

public class Lambda_Expression{
    public static void main(String[] args){

        A obj = () ->
        {
            System.out.println("In the show");
        };

        obj.show();
    }
}