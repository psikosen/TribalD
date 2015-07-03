package Calandar;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Point;
import android.provider.MediaStore;

/**
 * Created by Rook on 6/17/2015.
 */
public class Creature {
    Creature player;
    public int x,y,z;
    private World world;
    private CreatureAi creatureAi;
    private int maxHp;
    private int hp;
    private  int attackValue;
    private int defenseValue;
    private Creature ai;


    public Creature(Creature creature) {
        super();
    /*    this.maxFood = 1000;
        this.food = maxFood / 3 * 2;
   */ }

    public Creature(World world, int z, int y, int x) {
        this.world = world;
        this.z = z;
        this.y = y;
        this.x = x;
    }

    public boolean canEnter(int x, int y, Point z) {  return true;
    }

    public void moveBy(int mx, int my, int i) {
    }

    public boolean canSee(int mx, int my, int mz) {

        return ai.canSee(mx, my, mz);

    }
    public void moveBy(int mx, int my) {
        Creature other = world.creature(x + mx, y + my);
        if(other == null) {

            // creatureAi.onEnter(x + mx, y + my, world.tile(x+ mx,y + my)));
        }else{
        attack(other);

    }}

    private void attack(Creature other) {
            int amount =Math.max(0, attackValue() - other.defenseValue());
             amount = (int) Math.random() * amount  +1;
             other.modifyHp(-amount);
                world.remove(other);



    }

          //MediaStore.Audio
            private String MakeSound(){


             return MediaStore.EXTRA_DURATION_LIMIT;
            }

    public void doAction(String message, Object params){
                int r = 9;
        for (int ox = -r; ox < r+1; ox++) {
            for (int oy = -r; oy < r+1; oy++) {
                if(ox * ox + oy * oy > r* r)
                    continue;
                Creature other = world.creature(x + ox, y + oy);
                if(other ==null)
                continue;
                if(other == this)
                    other.notify();
                else
                other.notify();
            }
        }



    }


    private void modifyHp(int amount) {
        hp += amount;

        if(hp < 1){
           // doAction("die");
            world.remove(this);

        }
    }
    private int visionRadius;
    public int visionRadius(){return  visionRadius;}


    public void setCreatureAi(CreatureAi creatureAi) {
        this.creatureAi = creatureAi;
    }
    public Creature newPlayer(){
        Creature player = new Creature(world,0,0,0);
        world.addAtEmptyLocation(player);
        //new PlayerAi();
        return player;
    }

    public void update(){
        creatureAi.onUpdate();
        // creatures
         List <Creature> toUpdate = new ArrayList<Creature>();
            for(Creature creature: toUpdate){
                creature.update();
            }
            }
    /*
    * public Tile tile(int wx, int wy, int wz){return world.tile(wx,wy,wz)}
    * */


    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int attackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int defenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }
    public void eat(Item item){
        modifyFood(item.foodValue());
        Inventory.remove(item);
    }
    private void modifyFood(Object foodValue) {
		// TODO Auto-generated method stub
		
	}

	public void tile(int x, int y, int wz) {
    }

	public boolean canEnter(int x2, int y2, int z2) {
		// TODO Auto-generated method stub
		return true;
	}


    /*private int xp;
  public int xp() { return xp; }
  public void modifyXp(int amount) {
      xp += amount;

      notify("You %s %d xp.", amount < 0 ? "lose" : "gain", amount);

      while (xp > (int)(Math.pow(level, 1.5) * 20)) {
          level++;
          doAction("advance to level %d", level);
          ai.onGainLevel();
          modifyHp(level * 2);
      }
  }

  private int level;
  public int level() { return level; }*/

    /*public void gainMaxHp() {
    maxHp += 10;
    hp += 10;
    doAction("look healthier");
  }

  public void gainAttackValue() {
    attackValue += 2;
    doAction("look stronger");
  }

  public void gainDefenseValue() {
    defenseValue += 2;
    doAction("look tougher");
  }

  public void gainVision() {
    visionRadius += 1;
    doAction("look more aware");
  }*/

}
