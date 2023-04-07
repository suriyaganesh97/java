package interviewquestions;

public class MaximumNumber {
    public static void main(String[] args) {
        int num[] = {6,9,80,56,90,1};
        int maxnum=0, temp=0;
        for(int i:num){
            if(i>maxnum){
                maxnum=i;
            }
        }
        System.out.println(maxnum);
    }
}
