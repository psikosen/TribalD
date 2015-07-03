package Calandar;

import java.util.List;

/**
 * Created by Rook on 6/18/2015.
 */
public class World {
                //Tile [][] tile;
                private int width;
                private int height;
                Creature creature;
                private List<Creature> creatures;
                World world;
                 
             World(){


                    }
// Tile[][] Tiles
    public World(int width, int height) {
        //this.tiles = tiles;
        this.width = width;
        this.height = height;
    }

    public Creature creature(int x, int y){
        for(Creature c: creatures){

            if(c.x == x && c.y ==y)
                return  c;
            }
        return  null;
        }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void dig(int x, int y) {
       // if(tile(x,y).isDiggable()){
       //  tiles[x][y] = Tile.Floor;}

    }

    public void addAtEmptyLocation(Creature player) {
                int x;
                int y;
        do{
            x = (int) Math.random() * width;
            y = (int) Math.random() * height;

        }
        while(true);// while (!tile(x,y).isGround());
    /*
        	creature.x = x;
            creature.y = y;
*/
            }


    public void remove(Creature other) {
         creatures.remove(other);
    }

    public Creature creature(int wx, int wy, int wz) {
        return world.creature(wx, wy, wz); }
}

