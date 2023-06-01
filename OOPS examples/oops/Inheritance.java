package oops;

public class Inheritance {
    public static void main(String[] args) {
        Calctest obj1=new Calctest();
        System.out.println(obj1.sum(5, 6));
    }
}

class Calc{
    public int sum(int num1,int num2){
        return num1+num2;
    }
}

class Calcnew extends Calc{

}
class Calctest  extends Calcnew{

}
