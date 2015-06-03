package Calandar;

public class PlayerStats {
		private CalendarDate b;
		String name;
		double BodyTemperature = 98.7;
		private double staminaMax = 100;

		private double fatigueMin = 0D;
		private double fatigue = 0D;
		private double stamina = 0D;
		private long HunterRank;
		private double Temperature = 98.7;
		private double TemperatureMin =90;
		Entity entity;
		public PlayerStats(){
			
		}
		public void affectStats(double stamina, double fatigue,double Temperature){
			this.stamina = stamina;
			this.fatigue = fatigue;
			
			if(this.stamina >= staminaMax){
				this.stamina = staminaMax;
			}
			if(this.fatigue <= fatigueMin){
				this.fatigue = fatigueMin;
			}

			if(this.Temperature <= TemperatureMin){
				this.Temperature = TemperatureMin;
				if(Temperature == TemperatureMin){
				entity.dead(true);
			
		}}}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBodyTemperature() {
			return BodyTemperature;
		}
		public void setBodyTemperature(double bodyTemperature) {
			BodyTemperature = bodyTemperature;
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
		public double getFatigue() {
			return fatigue;
		}
		public void setFatigue(double fatigue) {
			this.fatigue = fatigue;
		}
		public double getStamina() {
			return stamina;
		}
		public void setStamina(double stamina) {
			this.stamina = stamina;
		}
		public long getHunterRank() {
			return HunterRank;
		}
		public void setHunterRank(long hunterRank) {
			HunterRank = hunterRank;
		}
		
	
}
