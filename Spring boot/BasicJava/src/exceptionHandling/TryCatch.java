package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=5%0;
		}
		catch(Exception e) {
			System.out.println("in exception block");
//			System.out.println(e);
			System.err.println("this is error output");
		}
		finally{
			System.out.println("in finally block");
		}

	}

}
