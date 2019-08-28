
public class Owner {
	
	//ATTRIBUTES
	private int id;
	private String name;
	private String lastName;
	private String date;
	private String typePetsFavorate;
	
	public Owner(int id, String name, String lastName, String date, String typePetsFavorate) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.date = date;
		this.typePetsFavorate = typePetsFavorate;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTypePetsFavorate() {
		return typePetsFavorate;
	}

	public void setTypePetsFavorate(String typePetsFavorate) {
		this.typePetsFavorate = typePetsFavorate;
	}
	
	
	
}
