package arrays;

public class VariableArgs {
public static int add(int ... n) {
	int sum=0;
	for(int i:n) {
		sum=sum+i;
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(add(1,2,3));
System.out.println(add(1,2,32,56,34));
	}

}
