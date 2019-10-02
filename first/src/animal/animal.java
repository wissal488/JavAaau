package animal;

public class animal {
	private int age;
	private String nom;
	private static int nbrAnimal=0;
	public double poid;
	private double speed;
	private int id;
	
	public String parle() {
		return "waaaaaalo";
	}
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPoid() {
		return poid;
	}


	public void setPoid() {
		this.poid = Math.random();
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static void setNbrAnimal(int nbrAnimal) {
		animal.nbrAnimal = nbrAnimal;
	}


	public static int getNbrAnimal() {
		return nbrAnimal;
	}

	
	public animal() {
		this.nbrAnimal++;
		
	}

}
