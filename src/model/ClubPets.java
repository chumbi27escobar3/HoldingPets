package model;
import java.util.ArrayList;

public class ClubPets {
	
//	public final static int VALOR_1 = 3;
	
	//ATTRIBUTES
	private int id;
	private String name;
	private int dateCreation;
	private String race;
	//RELETION 
	private ArrayList<Owner> owner;
	
	public ClubPets(int id, String name, int dateCreation, String race) {
		
		this.id = id;
		this.name = name;
		this.dateCreation = dateCreation;
		this.race = race;
		owner = new ArrayList<Owner>();
	}
	
	//GETTERS AND SETTERS
	public ArrayList<Owner> getOwner() {
		return owner;
	}

	public void setOwner(ArrayList<Owner> owner) {
		this.owner = owner;
	}
	
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

	public int getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(int dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	
	public String addOwner(int id, String name, String lastName, int date, String typePetsFavorate) {
		String msg =" ";
//		if(owener.comparTo())
//		owner.add(id, name, lastName, date, typePetsFavorate);
		
		msg = "Se ha podido agregar a el dueño " + name;
		return msg;
	}
}
