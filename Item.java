package Calandar;

import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Item {
        String name;
        String Description;
        Image item;
        int id;
        boolean Used;
        private double width;
        private double height;

    public Item(String name, String description, Image item, int id, boolean used) {
        this.name = name;
        Description = description;
        this.item = item;
        this.id = id;
        Used = used;
    }
    Item(){}


    public void addAtEmptyLocation(Item item, int depth) {
        int x;
        int y;
/*
        do {
            x = (int)(Math.random() * width);
            y = (int)(Math.random() * height);
      }
       while (!tile(x,y,depth).isGround() || item(x,y,depth) != null);

        items[x][y][depth] = item;
    /* 
     * 
    }
     */
    }
        
	public Object foodValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
