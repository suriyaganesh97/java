package codeExercises;

public class FeetInchconversion {

	public static void main(String[] args) {
	calcFeetInchesToCentimeters(7,5);
	calcFeetInchesToCentimeters(50);
	}
	public static double calcFeetInchesToCentimeters(double feet,double inches)
	{
		if(feet>=0 && (inches>=0 && inches<=12))
		{
				double centimetres=((feet*12)+inches)*2.54;
				System.out.println("centimetre value is "+centimetres);
						 return centimetres;
		}
		else 
			{
			System.out.println("Invalid value");
			return -1;
			}
	}
	public static double calcFeetInchesToCentimeters(double inches)//method overloading same name only param differrent
	{
		if(inches>=0)
		{
			double feetValue=(int) inches/12;
			double remainingInches=(int) inches%12;
			return calcFeetInchesToCentimeters(feetValue,remainingInches);//calling existing method in a rteurn type
		}
		else
			return -1;
	}
}
