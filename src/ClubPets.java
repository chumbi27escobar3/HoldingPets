
public class ClubPets {
	
	public static final int valor1 = 3;
	
	//ATTRIBUTES
	private int id;
	private String name;
	private int[] dateCreation;
	private String race;
	
	public ClubPets(int id, String name, int[] dateCreation, String race) {
		
		this.id = id;
		this.name = name;
		this.dateCreation = dateCreation;
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

	public int[] getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(int[] dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
}
