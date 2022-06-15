package oopsConcept;

class Calc{
	public int add(int i,int j) {
		return i+j;
	}	
}
class CalcAdv extends Calc{
	public int subtract(int a, int b) {
		return a-b;
	}	
}
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calc obj=new Calc();
CalcAdv obj1=new CalcAdv();
int result = obj.add(5, 18);
int result1=obj1.subtract(12,5);
int result2=obj1.add(7,8);
System.out.println(result);
System.out.println(result1);
System.out.println(result2);
	}
}
