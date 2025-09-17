class Human{

    private String name;
    private int age;
    //These  instance variables are made private so that it is not accessible from outside the class directly

    void setName(String s){
        name = s;
    }

    void setAge(int a){
        age=a;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
}

class Encapsulation{

    public static void main(String[] args){

        Human h=new Human();

        h.setAge(24);
        h.setName("Aditya Singh");

        System.out.println("The name of the person - "+ h.getName);

        System.out.println("The age of the person - "+ h.getAge);


    }
}