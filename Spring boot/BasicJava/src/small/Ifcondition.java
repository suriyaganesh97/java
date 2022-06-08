package small;
import java.util.*;
import java.io.*;
public class Ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
	System.out.println("enter a number:");
	int N = sc.nextInt();
	sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
						if(N%2!=0) {
							System.out.println("Weird.");
						}else {
							if((N>=2) && (N<=5)) {
								System.out.println("Not Weird.");
							}
							else if((N>=6) && (N<=20)) {
								System.out.println("Weird.");
							}
							else {
								System.out.println("Not Weird.");
							}
						}
	sc.close();
	
	}

}
