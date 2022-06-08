/**
 * 
 */
package classAndObj;

/**
 * @author Suriya.Ganesh
 *
 */

class NewStudent1 {
	String name;
	int math_mark;
	int sci_mark;
	int total_mark;
	//below is the constructor and we take parameters and assign it to this object values
	public NewStudent1(String name,int math_mark,int sci_mark) {
		this.name=name;
		this.math_mark=math_mark;
		this.sci_mark=sci_mark;
		
	}
	public void totalmarks() {
		total_mark = math_mark+sci_mark;
	}
}
public class ConstructorEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NewStudent1 Obj1=new NewStudent1("suriya",100,70);
Obj1.totalmarks();
System.out.println(Obj1.total_mark);
NewStudent1 Obj2=new NewStudent1("Kathick",60,50);
	}

}
