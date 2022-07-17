package firsttest;

import java.util.List;

public class StructuredProgramming {

	public static void main(String[] args) {
		printnumbers(List.of(2,3,1,3,56,23));

	}

	private static void printnumbers(List<Integer>numbersInList) {
		for(int i:numbersInList) {
			System.out.println(i);
		}
		
	}

}
