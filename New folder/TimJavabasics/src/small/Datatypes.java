package small;

public class Datatypes {

	public static void main (String[] args)
	{
		byte num1=3;
		short num2=2;
		int num3=777;
		long num4=(50000L+10L*(num1+num2+num3));  //you can specify long like this
		System.out.println(num4);
		//the value within the expression will be given as int
		
		long num5=(long)(50000+10*(num1+num2+num3));//or you can typecast in this manner
		System.out.println(num5);
		/*
		 8 primitive datatypes are as follows 
		 byte  -128 to 127
		 short  
		 int
		 long
		 float
		 double
		 char
		 boolean
		 
		 */
	}
	
}
