package interviewquestions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=370,armstrongnum=0,temp=0,rev=0;
        temp=num;
        while(num!=0){
            rev=num%10;
            armstrongnum+=(rev*rev*rev);
            num=num/10;
        }
        if(armstrongnum==temp){
            System.out.println("it is a armstrong number");
        } else{
            System.out.println("it is not an armstrong number");
        }
    }
}
