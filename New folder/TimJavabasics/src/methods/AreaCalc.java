package methods;

public class AreaCalc {

	public static void main(String[] args) {
		System.out.println(area(5));
		System.out.println(area(5,-4));
	}
  public static double area(double rad)
  {
	  if(rad>=0)
	  {
		  return (rad*rad*Math.PI);  // pi value stored as a constant in Java
	  }
	  else
		  return -1;
  }
  public static double area(double breadth,double width)
  {
	  if(breadth>=0 && width>=0)
	  {
		  return (breadth*width);
	  }
	  else
		  return -1;
  }
}
