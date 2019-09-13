package model;

import java.util.Comparator;

public class Pet implements Comparable<Pet>, Comparator<Pet>{

	//ATTRIBUTES
	private int id;
	private String name;
	private String date;
	private char gender;
	private String race;
		
	public Pet(int id, String name, String date, char gender, String race) {
			
		this.id = id;
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.race = race;
	} 
	
	//GETTERS AND SETTERS 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public int compare(Pet o1, Pet o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Pet arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
		
		
		
		
}
