package interviewquestions;

public class StrongNumber {
    public static void main(String[] args) {
        int num=145,rev=0,sumofFactorial=0; //Eg 145= 1! + 4! + 5! = 1+24 +120=145
        int temp=num;
int factorialvalue;


while(num!=0){
    rev=num%10;
    factorialvalue=factorial(rev);// calling factorial method for each and every digit and making the sum
    sumofFactorial+=factorialvalue;
    num=num/10;
}
if(temp==sumofFactorial){
    System.out.println("it is a factorial number");
} else{
    System.out.println("it is not a factorial number");
}

    }
    static int factorial(int num){//method to get factorial value
        int factorialvalue=1;
        for(int i=1;i<=num;i++){
            factorialvalue=factorialvalue*i;
        }
        return factorialvalue;
    }
}
