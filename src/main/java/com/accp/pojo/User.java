package com.accp.pojo;

import java.util.List;

public class User {
	private String name;
	private String city;
	private List<String> language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getLanguage() {
		return language;
	}
	public void setLanguage(List<String> language) {
		this.language = language;
	}
	public User(String name, String city, List<String> language) {
		super();
		this.name = name;
		this.city = city;
		this.language = language;
	}
	public User() {
		super();
	}
	
}
