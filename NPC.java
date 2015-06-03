package Calandar;

import java.util.ArrayList;

public class NPC extends Entity{

	@Override
	public void update(float data) {

	}

	public static enum AnimalBehavior{
				ANGRY, DOMESTICATABLE, TAME, AGITATED
				
			}
			public static enum Direction{
				UP,DOWN,LEFT,RIGHT
				
			}
			public static enum behavior{
				WILDPATH,ERRATIC,RESTFUL
			}
			
			protected ArrayList<String> Sounds = new ArrayList<String>(213);	
			
			private Inventory[] set;
			private Item i;
			AnimalData animal;
}
