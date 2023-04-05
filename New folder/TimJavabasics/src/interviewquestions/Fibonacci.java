package interviewquestions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        int num1=-1,num2=1,sum=0,n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of fibonacci numbers to be generated\n");
        n=sc.nextInt();
        sc.close();
        System.out.println("Fibonacci series are\n");

        for(int i=0;i<n;i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.println(sum);
        }
    }
}
