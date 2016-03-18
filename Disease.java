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
        InfectionRATE(numOfDaysInfected);
        
            }

    Disease(Player p){


            }
    public void InfectionRATE(int nod){
         /*    switch(nod){
                  case nod < 10 :
                     chaceOfDying = chaceOfDying *= (10/100) ;                  
                       break;   
            
                  case nod > 10 && nod < 20 :
                     chaceOfDying = chaceOfDying  *= 30/100 ;                  
                       break;
                  case nod > 20 && nod < 40 :
                     chaceOfDying = chaceOfDying  *= 50/100 ;                  
                       break;
                  case nod > 20 && nod < 40 :
                     chaceOfDying = chaceOfDying  *= 60/100 ;                  
                       break;
                     default:
                          chaceOfDying = 0 ;                  
                    
                       
        }*/
        
   
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
