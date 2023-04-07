package interviewquestions;

public class factorialofaNumber {
    public static void main(String[] args) {
        int num=6, result=1; // if you initilaise result as 0 then entire 
        //value will become zero so pls be careful
        for(int i=1;i<=num;i++){
result=result*i;
        }
        System.out.println(result);
    }
}
