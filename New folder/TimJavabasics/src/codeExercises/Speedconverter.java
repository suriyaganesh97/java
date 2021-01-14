package codeExercises;

public class Speedconverter {

	public static void main(String[] args) {
		double kilometersPerHour=10.25;
		toMilesPerHour(kilometersPerHour);
		printConversion(kilometersPerHour);

	}

	public static long toMilesPerHour(double kilometersPerHour)
	{
		
		if(kilometersPerHour>=0){
			kilometersPerHour=kilometersPerHour/1.609;
			long roundValue=Math.round(kilometersPerHour);
			return roundValue;
		}
		
		else 
		return -1;
	}
  public static void printConversion(double kilometersPerHour)
  {
	  if(kilometersPerHour>=0)
	  {
	  long mileValue=toMilesPerHour(kilometersPerHour);
	  System.out.println(kilometersPerHour+" Km/h = "+mileValue+" mi/h");
	  }
	  else
		  System.out.println("Invalid value");
  }
}
