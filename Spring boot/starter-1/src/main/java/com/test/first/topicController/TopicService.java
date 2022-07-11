package com.test.first.topicController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topics> topics= new ArrayList<>(Arrays.asList(
			new Topics("java","java","java learning"),
			new Topics("python","python","python learning"),
			new Topics("js","javascript","js learning")
			));
	
	public List<Topics> getAllTopics(){
		return topics;
	}
	
	public Topics getTopic(String id) {
		int j=0;
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(id)) { 
				j=i;
			}
		}
		return topics.get(j);
//		return topicService.stream().filter(t ->t.getId().equals(id)).findFirst().get();
// the above line uses lambda expression by java brains there for just reference
	}

	public void addTopic(Topics topic) {
		topics.add(topic);
		
	}

	public void updatetopic(String id,Topics topic) {
		for(int i=0;i<topics.size();i++) {
			Topics t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deletetopic(String id) {
		int j=0;
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(id)) { 
				j=i;
			}
		}
		topics.remove(j);
		
	}

	
}
