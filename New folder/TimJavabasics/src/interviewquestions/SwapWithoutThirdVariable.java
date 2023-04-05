package interviewquestions;

public class SwapWithoutThirdVariable {
    public static void main(String args[]){
        int num1=7,num2=5;
        System.out.println("before swapping\n");
        System.out.println("num1  "+num1+"  num2  "+num2);
        num1=num1+num2;  // num1=12=5+7
        num2=num1-num2; // num2=7=12-5
        num1=num1-num2;  //num1=5=12-7
        System.out.println("after swapping\n");
        System.out.println("num1  "+num1+"  num2  "+num2);

    }
}
