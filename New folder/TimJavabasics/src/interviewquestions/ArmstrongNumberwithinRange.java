package interviewquestions;

public class ArmstrongNumberwithinRange {
    public static void main(String[] args) {
        int range1=1,range2=500;
        int armstrongnumber=0,temp=0,rev=0,num=0;
        for(int i=range1;i<=range2;i++){
            temp=i;
            num=i;
            armstrongnumber=0;
            while(num!=0){
                rev=num%10;
                armstrongnumber+=(rev*rev*rev);
                num=num/10;
                
            }
            if(armstrongnumber==temp){
                System.out.println(armstrongnumber);
            }
        }
    }
}
