package interviewquestions;

public class SwapWithThirdVariable {
    public static void main(String args[]){
        int num1=5,num2=7,num3=0;
        System.out.println("before swapping\n");
        System.out.println("num1  "+num1+"  num2  "+num2);
        num3=num2;
        num2=num1;
        num1=num3;
        System.out.println("after swapping\n");
        System.out.println("num1  "+num1+"  num2  "+num2);

    }
}
