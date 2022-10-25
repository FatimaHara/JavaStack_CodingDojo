package zookeeper;

public class ZooTest {

	public static void main(String[] args) {
		Gorilla gorillaObj = new Gorilla();
		gorillaObj.eatBananas();
		gorillaObj.eatBananas();
		gorillaObj.climb();
		System.out.println(gorillaObj.displayEnergy());
		Bat batObj=new Bat();
		batObj.attackTown();
		batObj.attackTown();
		batObj.attackTown();
		batObj.eatHumans();
		batObj.eatHumans();
		batObj.fly();
		batObj.fly();
		batObj.displayEnergy();

		
	}

}
