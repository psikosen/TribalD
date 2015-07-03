package Calandar;

/**
 * Created by Rook on 6/18/2015.
 */
public abstract class LevelUpOption {


    private String name;
    public String name() { return name; }

    public LevelUpOption(String name){
        this.name = name;
    }

    public abstract void invoke(Creature creature);

}
