package Calandar;

public class Disease {
            Player p;
            String name;
            Severity Severity[];
            int numOfDaysInfected;
            double chanceOfDying;

    public Disease(String name, Calandar.Severity[] severity, int numOfDaysInfected, double chanceOfDying) {
        this.name = name;
        Severity = severity;
        this.numOfDaysInfected = numOfDaysInfected;
        this.chanceOfDying = chanceOfDying;
    }

    Disease(Player p){


            }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calandar.Severity[] getSeverity() {
        return Severity;
    }

    public void setSeverity(Calandar.Severity[] severity) {
        Severity = severity;
    }

    public int getNumOfDaysInfected() {
        return numOfDaysInfected;
    }

    public void setNumOfDaysInfected(int numOfDaysInfected) {
        this.numOfDaysInfected = numOfDaysInfected;
    }

    public double getChanceOfDying() {
        return chanceOfDying;
    }

    public void setChanceOfDying(double chanceOfDying) {
        this.chanceOfDying = chanceOfDying;
    }
}
