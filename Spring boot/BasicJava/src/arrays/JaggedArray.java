package arrays;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {
		{1,4,5},
		{2,3},
		{6,3,9}	
};
//for(int i=0;i<a.length;i++) 
//{
//	for(int j=0;j<a[i].length;j++) {
//		System.out.print(" "+a[i][j]);
//	}
//	System.out.println("\n");
//}

for(int k[]:a) {
	for(int l:k) {
		System.out.print(l);
	}
	System.out.print("\n");
}
	}

}
