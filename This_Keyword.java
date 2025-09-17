class Human{

    private String name;
    private int age;
    //These  instance variables are made private so that it is not accessible from outside the class directly

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
        //Here the "age" variable that is being passed as an argument on the right side is a local variable
        //And the "age" variable on the left hand side is the "instance variable"
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
}

class This_keyword{

    public static void main(String[] args){

        Human h=new Human();

        h.setAge(24);
        h.setName("Aditya Singh");

        System.out.println("The name of the person - "+ h.getName());

        System.out.println("The age of the person - "+ h.getAge());


    }
}