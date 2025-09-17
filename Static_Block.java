class Mobile{

    int price;
    String brand;
    static String type;

    static
    {
        type="Smartphone";

        System.out.println("we are showing this message from the Static Block");
    }

    public void show()
    {
        System.out.println(brand+" : "+price+" : "+type);
    }
}

class Static_Block{
    public static void main(String[] args)
    {
        Mobile mb=new Mobile();

        mb.brand="Apple";
        mb.price=1200;

        mb.show();


    }
}