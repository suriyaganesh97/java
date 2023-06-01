package oops;

public class methodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,7));
    }
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }
}
