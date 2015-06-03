package Calandar;

import java.util.LinkedList;
import java.util.List;

public class Inventory extends Item {
			
			List<Item> list;
			public Inventory() {
				list = new LinkedList<Item>();
			
			
			
			}

			public void add(Item item){
				list.add(item);

			}
			public void remove(Item item){
					list.remove(item);

			}
			public  void Clear(){
				list.clear();

			}

}
