class Student
{
	String name;
	int num1;
	int marks;
	public Student(int num1)  //constructor
	{
		this.num1=num1;// this keyword refers to current object or instance
	}
}
public class check {
public static void main(String args[])
{
	Student obj=new Student(5);
	System.out.println(obj.num1);
}
}
