package practise;

public class Sorting {
    public static void main(String args[])
	{
        int num[] = {6,9,80,56,90,1};
        int temp=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        for(int k:num){
            System.out.println(k);
        }
    }
}
