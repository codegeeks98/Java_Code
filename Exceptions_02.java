public class Exceptions_02{
    public static void main(String[] args){

        int i=18;
        int j=0;

        int arr[]=new int[5];

        String s=null;

        try
        {
            j=2;
            System.out.println(i/j);      //trying to divide by zero
            System.out.println(arr[2]);   //trying to access the element out of the limit of array
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can not divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("trying to access beynd the array limit");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..."+e);
        }

        System.out.println("Outside the try catch block...");
    }
}