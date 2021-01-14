package codeExercises;

public class MinToYearAndDay {

	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);

	}
  public static void printYearsAndDays(long minutes)
  {
	  if(minutes>=0)
	  {
		  int years=(int)(minutes/(60*24*365));
		  int leftMinutes=(int)(minutes%(60*24*365));
		  int days=(leftMinutes/(60*24));
		  System.out.println(minutes+" min "+years+" y "+days+" d ");
		  
	  }
	  else
		  System.out.println("Invalid Value");
  }
}
