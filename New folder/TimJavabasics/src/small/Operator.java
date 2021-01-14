package small;

public class Operator 
{

	public static void main(String[] args) 
	{
	double num1=20;
	double num2=80;
	double num3=((num1+num2)*100)%40;
	boolean boolvalue=true;
	if(num3==0)
		boolvalue=true;
	if(num3!=0)
		boolvalue=false;
	System.out.println(boolvalue);
	}

}
