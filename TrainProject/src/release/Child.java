package release;

public class Child implements Mother, Father{

	@Override
	public void adn() {
		System.out.println("Father >> child >> adn");
		
	}

	@Override
	public void playSport() {
		Mother.super.playSport();
		Father.super.playSport();
		System.out.println("playing Game");
	}
	
	

}
