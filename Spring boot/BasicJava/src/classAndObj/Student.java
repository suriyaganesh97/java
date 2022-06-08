
package classAndObj;

class NewStudent {
	String name;
	int math_mark;
	int sci_mark;
	int total_mark;
	void totalMark() {
		total_mark = math_mark+sci_mark;
	}
}


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NewStudent Obj=new NewStudent(); //creating a new Object in the type of NewStudent
//Obj is the reference to the object
Obj.name="Suriya";
Obj.math_mark=100;
Obj.sci_mark=80;
Obj.totalMark();   //calling method total mark inside the object
System.out.println(Obj.total_mark);
	}

}
