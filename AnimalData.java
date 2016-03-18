package Calandar;

public class AnimalData {
	private int hp;
	private int attack;
	private int def;
	private int lifeSpan;
	private int healthiness;
	boolean sick;
	boolean isAttacking;
	int daysNotFed;
	int angerLevel;
	AnimalData a;
	
	
	public AnimalData(int hp, int attack, int def, int lifeSpan,
			int healthiness, boolean sick, int daysNotFed, int angerLevel) {
		super();
		this.hp = hp;
		this.attack = attack;
		this.def = def;
		this.lifeSpan = lifeSpan;
		this.healthiness = healthiness;
		this.sick = sick;
		this.daysNotFed = daysNotFed;
		this.angerLevel = angerLevel;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public int getHealthiness() {
		return healthiness;
	}
	public void setHealthiness(int healthiness) {
		this.healthiness = healthiness;
	}
	public boolean isSick() {
		
		
		
		return sick;
	}
	public void setSick(boolean sick) {
		this.sick = sick;
	
	
	
	}
	public void ifSick(){
		
	if(a.sick == true){
	for(int g = a.healthiness, o = a.hp;g>=20 || o<=20;g--,o--){
				
			}
			
		}
	}
	
	public boolean isAttacking() {
		return isAttacking;
	}
	public void setAttacking(boolean isAttacking) {
		this.isAttacking = isAttacking;
	}
	public int getDaysNotFed() {
	         switch(daysNotFed){
			//enum behavior = ANGRY
			a.hp -= 6;
		}
		
		return daysNotFed;
	}
	public void setDaysNotFed(int daysNotFed) {
		this.daysNotFed = daysNotFed;
	}
	public int getAngerLevel() {
		return angerLevel;
	}
	public void setAngerLevel(int angerLevel) {
		this.angerLevel = angerLevel;
	}
	
	
}
