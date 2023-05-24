package userInput;

public class LeastPositive {
    public static void main(String[] args) {
        int[] arr={1,5,9,12,2,4,2,3,12,6,7};
        int temp=0;
for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<=arr.length-1;j++){
        if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
        }
    }
}  

// for(int k:arr){
//     System.out.println(k);
// }
int l=0;
int leastnum=0;
for(int k=1;k<arr.length-1;k++){
    if(arr[k]==l){
System.out.println(l);
    } else{
        leastnum=l;
    }
    l++;
}
System.out.println("least "+leastnum);
    }
    
}
