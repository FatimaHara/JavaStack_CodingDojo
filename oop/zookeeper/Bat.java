package zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super();
		this.energyLevel =300;
	}
	public void fly() {
		System.out.println("The Sound of Bat");
		energyLevel-=50;
	}
	
	
	public void eatHumans(){
		System.out.println(" so- well, never mind");
		energyLevel+=50;
	}
	
	public void attackTown(){
		System.out.println("sound of a town on fire");
		energyLevel-=100;
	}
}
