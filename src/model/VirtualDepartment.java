package model;

import java.util.ArrayList;
import java.util.List;

public abstract class VirtualDepartment {
	
	private String name;
	private Person leader;
	private List<Person> personsList = new ArrayList<>();	
	
	public VirtualDepartment(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	protected void setLeader(Person person) {
		leader = person;
	}
	
	protected Person getLeader() {
		return leader;
	}
	
	protected void addPerson(Person person) {
		personsList.add(person);
	}
	
	protected Person getPerson(int index) {
		if(index>=personsList.size())
			return null;
		return personsList.get(index);
	}
	
	protected int getPersonsListSize() {
		return personsList.size();
	}
	
	public String toString() {
		String string = "\nname: " + name + "\ndirected by: ";
		string += (leader != null) ? leader.getFullname() : "undefined";
		string += "\ncountain " + getPersonsListSize() + " members";
		return string;
	}
	
}
