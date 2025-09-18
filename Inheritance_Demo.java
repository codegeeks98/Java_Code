//Super class
class Calc{

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }
}

//Sub class of Calc
class AdvCalc extends Calc{

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }
}

class Inheritance_Demo{
    public static void main(String[] args){

        AdvCalc c=new AdvCalc(); //Creating the Object of the sub class

        int r1 = c.add(60, 4); //Getting the result of add method in r1

        int r2 = c.sub(60, 4); //Getting the result of sub method in r2

        int r3 = c.mul(60, 4);

        int r4 = c.div(60, 4);

        System.out.println(r1+" : "+r2+" : "+r3+" : "+r4);



    }
}