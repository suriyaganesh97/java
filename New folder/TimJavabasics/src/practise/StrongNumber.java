package practise;

public class StrongNumber {
    public static void main(String args[]){
        int num=145,rev=0,sum=0;//145
        while(num!=0){
            rev=num%10;
            sum=sum+factorial(rev);
            num=num/10;
        }
        
        System.out.println(sum);
    }
    public static int factorial(int num){
        int factorialvalue=1;
        for(int i=1;i<=num;i++){
            factorialvalue*=i;
        }
        return factorialvalue;
    }
    
}
