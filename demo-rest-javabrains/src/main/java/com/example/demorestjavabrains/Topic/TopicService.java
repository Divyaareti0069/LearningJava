package com.example.demorestjavabrains.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;
@Service
public class TopicService {

	List<Topics> topics=new ArrayList<>(Arrays.asList (new Topics(1,"Core Java","basic Java"),
			new Topics(2,"OOPS Concepts","Important concepts"),
			new Topics(3,"Spring Framework","Spring Framework"),
			new Topics(4,"Spring boot","Spring boot topics")
			));
	
	
	public List<Topics> getaAllTopics(){
		return topics;
	}


	public Topics getSpecificTopic(int id) {
		
		return topics.stream().filter(t->t.getId()==id).findFirst().orElse(null);
	}

	

	public void addTopic(Topics topic) {
		topics.add(topic);
	}


	public void UpdateTopic(Topics topic,int id) {
		for(int i=0;i<topics.size();i++) {
			Topics t=topics.get(i);
			if(t.getId()==id) {
				topics.set(i, topic);
				return;
			}
		}
		
	}


	public void deleteTopic(int id) {
		
		topics.removeIf(t->t.getId()==id);
		
		
	}
	
	
	
	
}
