package animal;

public class chat extends animal{

	public chat(int age, String nom, double speed) {
		super(age, nom);
		this.setSpeed(speed);		
	}
	
	public String parle() {
		return "myaaaaaw";
	}
	
	public void setpoid() {
		animal.poid = Math.random()*10;
	}
}
