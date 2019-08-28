
public class Pet {

	//ATTRIBUTES
	private String id;
	private String name;
	private String date;
	private char gender;
	private String race;
		
	public Pet(String id, String name, String date, char gender, String race) {
			
		this.id = id;
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.race = race;
	}

	//GETTERS AND SETTERS 
	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		
		
		
		
}
