package Calandar;

/**
 * Created by Rook on 5/30/2015.
 */
public class TribeData extends Entity {

            String name;
            int numOfMemebers;
            boolean producing;

    public TribeData(String name, int numOfMemebers, boolean producing) {
        this.name = name;
        this.numOfMemebers = numOfMemebers;
        this.producing = producing;
    }

    @Override
    public void update(float data) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfMemebers() {
        return numOfMemebers;
    }

    public void setNumOfMemebers(int numOfMemebers) {
        this.numOfMemebers = numOfMemebers;
    }

    public boolean isProducing() {
        return producing;
    }

    public void setProducing(boolean producing) {
        this.producing = producing;
    }
    public void increaseTribeMembers(){
        numOfMemebers++;

    }

}
