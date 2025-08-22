package com.unachi.prog5.model;

public class student {
	private final String id;
	private final String name;

	public student(String id,String name) {
		this.id = id;
		this.name = name;	
	}
	
	public String summary() {
		return "student{id='"+ id +"', name=='"+name+"'}";
	}

}
