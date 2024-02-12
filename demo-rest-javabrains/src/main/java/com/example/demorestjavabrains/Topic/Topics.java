package com.example.demorestjavabrains.Topic;

public class Topics {


	private int id;
	private String name;
	private String description;
	
	
	public Topics() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		description = description;
		
	}
	public Topics(String name, int id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Topic [name=" + name + ", id=" + id + ", Description=" + description + "]";
	}
	
	
	

}
