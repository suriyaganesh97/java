package codeExercises;

public class SecondandMinutes {

	public static void main(String[] args) {
		System.out.println(getDurationString(570,0));  //instead of storing in a variable and displaying you can directly code it like this
	}
  public static String getDurationString(int seconds)  //overloaded method
	  {
		  if(seconds>=0)  //seconds converted to mins,seconds
		  {
			  int minutes=seconds/60;
			  int remainingSeconds=seconds%60;
			  return getDurationString(minutes,remainingSeconds);
		  }
		  else
			  return "Invalid Value";
	  }
	  
  public static String getDurationString(int minutes,int seconds)  //overloaded method
  {
	  if((minutes>=0)&&(seconds>=0 && seconds<=59))
	  {
		  int hours=minutes/60;  //minutes converted to hrs,mins
		  int leftMinutes=minutes%60;  //minutes which are seperate other than calculated hrs
		  String hoursString=hours+"hrs"+leftMinutes+"mins"+seconds+"seconds";
		  if(hours<10)
			  hoursString="0"+hours+"hrs"+leftMinutes+"mins"+seconds+"seconds";
		  return hoursString;
	  }
	  else
		  return "Invalid value";
  }
  

}
