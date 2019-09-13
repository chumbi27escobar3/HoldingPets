package model;
import java.util.ArrayList;
import java.util.Comparator;

public class ClubPets implements Comparable<ClubPets>, Comparator<ClubPets> {
	
	//ATTRIBUTES
	private int id;
	private String name;
	private int dateCreation;
	private String race;
	//RELETION 
	public ArrayList<Owner> owner;
	
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
	
	public void addOwner(Owner o) {
		owner.add(o);
	}
	
	public void removeOwner(Owner e){
		for (int i = 0; i < owner.size(); i++) {
			if(owner.get(i).getName().equals(name)) {
				owner.remove(i);
				System.out.println("Se ha removido correctamente el club");
			} else {
				System.out.println("No se encontro ningun club con ese nombre");
			}
		}
		
	}
	
	public void orderingOwners(int[] a){
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && a[j-1]>a[j];j--) {
					int tmp = a[j-1];
					a[j] = a[j-1];
					a[j-1]= tmp;
				
			}
		}
	}
	
	public void orderingOwnersNumPets(Owner a){
//		if (a.get(i).getNum) {	
//		}
	}
	
	public void orderingclubNumOwner() {
		for(int i = owner.size(); i > 0; i++) {
			for(int j = 0; j< i - 1;j++) {
				if(owner.get(j).getName().compareTo(owner.get(j+1).getName())>0) {
					Owner tmp = owner.get(j);
//					owner.get(j) = owner.get(j+1);
//					owner.get(j+1) = tmp;
				}
			}
		}
	}

	@Override
	public int compareTo(ClubPets o) {
		return 0;
	}
	
	public void compararPorName(ClubPets o) {
//		return clubs.get().getName().compareTo(o.get(indexMax).getName());
	}

	@Override
	public int compare(ClubPets o1, ClubPets o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
