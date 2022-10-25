package zookeeper;

public class Mammal {
	int energyLevel ;
	public Mammal() {
		super();
		this.energyLevel = 100;
	}
	 public int displayEnergy() {
		 System.out.println(energyLevel);
		return energyLevel;
	}
	
}
