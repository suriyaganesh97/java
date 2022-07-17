package firsttest;

import java.util.List;


public class FuncProgrammingEg2 {

	public static void main(String[] args) {
		printnumbers(List.of("Spring boot","Spring","API"));

	}

	private static void printnumbers(List<String> topicList) {
		//to match strings having length of 3
		topicList.stream().filter(topics->topics.length()==3).forEach(topic->System.out.println(topic));
		// to match strings which have the word Spring
		topicList.stream().filter(topics->topics.contains("Spring")).forEach(topic->System.out.println(topic));
		
		//to print the number of chars in string
				topicList.stream().map(topics->topics.length()).forEach(topic->System.out.println(topic));
			}

	
}
