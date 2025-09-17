class Human{

    String name;
    int age;

    //This is the Constructor
    //Constructor will have no return type
    //It will have the same name as the class name

    public Human(){

        name = "Partha";
        age = 90;

        System.out.println("This is the message from the Constructor");
    }

    //Parameterized Constructor

    public Human(String name, int age){

        this.name = name;
        this.age = age;
        System.out.println(name+" : "+age);
    }
    

    public void show(){

        System.out.println(name+" : "+age);
    }
}

class Constructor{

    public static void main(String[] args){

        Human h=new Human(); //Default Constructor will be called here

        h.show(); //This will print the default values set by the Constructor above

        Human h1=new Human("Aditya Singh", 24); //Parameterized Constructor will be called here




    }
}