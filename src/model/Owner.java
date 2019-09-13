package model;
import java.util.ArrayList;
import java.util.Comparator;

public class Owner implements Comparable<Owner>, Comparator<Owner> {
	
	//ATTRIBUTES
	private int id;
	private String name;
	private String lastName;
	private String date;
	private String typePetsFavorate;
	//RELATION
	private ArrayList<Pet> pets;
	
	public Owner(int id, String name, String lastName, String date, String typePetsFavorate) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.date = date;
		this.typePetsFavorate = typePetsFavorate;
		
		pets = new ArrayList<Pet>();
	}

	//GETTERS AND SETTERS
	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
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
	
	public boolean addPet(Pet u, String name) {
		boolean enc = false;
		for (int i = 0; i < pets.size() && enc != false; i++) {
			if (pets.get(i).getName().equals(name)) {
				enc = false;				
			} else {
				pets.add(u);
				enc = true;
			}
		}
		return enc;
	}
	
	public void removePet(Pet a){
//		remove(a);
	}
	
	public void orderingPets(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && a[j-1]>a[j];j--) {
					int tmp = a[j-1];
					a[j] = a[j-1];
					a[j-1]= tmp;
				
			}
		}
	}

	@Override
	public int compareTo(Owner o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(Owner arg0, Owner arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
