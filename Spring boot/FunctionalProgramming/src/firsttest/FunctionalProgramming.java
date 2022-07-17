package firsttest;

import java.util.List;

public class FunctionalProgramming {

	public static void main(String[] args) {
		printnumbers(List.of(2,3,1,3,56,23));

	}

	private static void printnumbers(List<Integer>numbersInList) {
		System.out.println("printing even numbers");
		numbersInList.stream().filter(number->number%2==0).forEach(num->System.out.println(num));

		System.out.println("printing square of even numbers thru map");
		numbersInList.stream().filter(number->number%2==0).map(number->number*number)
		.forEach(num->System.out.println(num));
		
		
		System.out.println("printing odd numbers");
				numbersInList.stream().filter(number->number%2!=0).forEach(num->System.out.println(num));
		
				System.out.println("printing cubes of odd numbers thru map");
				numbersInList.stream().filter(number->number%2!=0).map(number->number*number*number)
				.forEach(num->System.out.println(num));
	}
}
