package interviewquestions;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i%5==0 && i%3==0 ){
                System.out.println("fizzbuzz\n");
            } else if(i%3==0){
                System.out.println("fizz\n");
            } else if(i%5==0){
                System.out.println("buzz\n");
            } else{
                System.out.println(i+"\n");
            }
        }
    }
}
