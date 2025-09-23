interface A{
    void sum(int a, int b);
}

public class Lambda_Expression_02{
    public static void main(String[] args){

        //Lambda Expression
        A obj = (int a, int b) ->
        {
            int sum = a+b;
            System.out.println("Sum is : "+sum);
        };

        obj.sum(2,3);
    }
}