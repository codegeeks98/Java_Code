enum Status{
    Running, Success, Failed, Pending;
}

enum Directions{
    North, South, East, West;
}

public class Enum_Demo{
    public static void main(String[] args){

        Status s=Status.Running;

        System.out.println(s);

        Directions d=Directions.North;

        System.out.println(d);

    }
}