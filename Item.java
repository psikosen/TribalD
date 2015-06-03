package Calandar;

import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Item {
        String name;
        String Description;
        Image item;
        int id;
        boolean Used;

    public Item(String name, String description, Image item, int id, boolean used) {
        this.name = name;
        Description = description;
        this.item = item;
        this.id = id;
        Used = used;
    }
    Item(){}
}
