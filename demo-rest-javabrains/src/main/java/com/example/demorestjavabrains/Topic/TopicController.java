package com.example.demorestjavabrains.Topic;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	private TopicService service;
	
	TopicController(TopicService service){
		this.service=service;
	}
	
	@GetMapping("/topics")
	public List<Topics> getalltopics(){
		return service.getaAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Topics getSpecificTopic(@PathVariable int id) {
		return service.getSpecificTopic(id);
		
	}

	@PostMapping("/addtopic")
	public void addTopic(@RequestBody Topics topic) {
		 service.addTopic(topic);
}
	
	@PutMapping("/updatetopic/{id}")
	public void UpdateTopic(@RequestBody Topics topic,@PathVariable int id) {
		 service.UpdateTopic(topic,id);
		
	}
	
	@DeleteMapping("/deletetopic/{id}")
	public void deleteTopic(int id) {
		
		service.deleteTopic(id);
		
}
}
