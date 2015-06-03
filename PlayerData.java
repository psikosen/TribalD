package Calandar;

import java.util.HashMap;

public class PlayerData {
	// TribeRelationship 
	private HashMap<String,NPC> entity_Relationships;
	private double staminaMax = 100D;
	private double fatigueMin= 0D;
	private double stamina = 0D;
	private double fatigue;
	private Inventory Inventory;
	private double exp;
	int waterAmount;
	double currentBodyTemperature;
	Disease sick;
	int wellNessValue = 100;
	int TribeMembers = 0;


	public PlayerData(HashMap<String, NPC> entity_Relationships, double staminaMax, double fatigueMin, double stamina, double fatigue, Calandar.Inventory inventory, double exp, int waterAmount, double currentBodyTemperature, Disease sick, int wellNessValue) {
		this.entity_Relationships = entity_Relationships;
		this.staminaMax = staminaMax;
		this.fatigueMin = fatigueMin;
		this.stamina = stamina;
		this.fatigue = fatigue;
		Inventory = inventory;
		this.exp = exp;
		this.waterAmount = waterAmount;
		this.currentBodyTemperature = currentBodyTemperature;
		this.sick = sick;
		this.wellNessValue = wellNessValue;
	}

	public HashMap<String, NPC> getEntity_Relationshipss() {
		return entity_Relationships;
	}

	public void setEntity_Relationshipss(HashMap<String, NPC> entity_Relationshipss) {
		this.entity_Relationships = entity_Relationshipss;
	}

	public double getStaminaMax() {
		return staminaMax;
	}

	public void setStaminaMax(double staminaMax) {
		this.staminaMax = staminaMax;
	}

	public double getFatigueMin() {
		return fatigueMin;
	}

	public void setFatigueMin(double fatigueMin) {
		this.fatigueMin = fatigueMin;
	}

	public double getStamina() {
		return stamina;
	}

	public void setStamina(double stamina) {
		this.stamina = stamina;
	}

	public double getFatigue() {
		return fatigue;
	}

	public void setFatigue(double fatigue) {
		this.fatigue = fatigue;
	}

	public Calandar.Inventory getInventory() {
		return Inventory;
	}

	public void setInventory(Calandar.Inventory inventory) {
		Inventory = inventory;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public int getWaterAmount() {
		return waterAmount;
	}

	public void setWaterAmount(int waterAmount) {
		this.waterAmount = waterAmount;
	}

	public double getCurrentBodyTemperature() {
		return currentBodyTemperature;
	}

	public void setCurrentBodyTemperature(double currentBodyTemperature) {
		this.currentBodyTemperature = currentBodyTemperature;
	}

	public Disease getSick() {
		return sick;
	}

	public void setSick(Disease sick) {
		this.sick = sick;
	}

	public int getWellNessValue() {
		return wellNessValue;
	}

	public void setWellNessValue(int wellNessValue) {
		this.wellNessValue = wellNessValue;
	}

	public PlayerData(int tribeMembers) {
		TribeMembers = tribeMembers;
	}

	public int getTribeMembers() {
		return TribeMembers;
	}
}
