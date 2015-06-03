package Calandar;

public enum Season {
		
		
	
		SPRING("Spring",16800,12000,1,1 ,0.6082D,0.01F,1850l, 0x00D900),
		SUMMER("Spring",25000,5000,0,3 ,0.6082D,0.01F,1850l, 0x00D900),
		FALL("Spring",12000,13000,3,2,0.6082D,0.01F,1850l, 0x00D900),
		WINTER("Spring",11000,12500,2,1,0.6082D,0.01F,1850l, 0x00D900);
		
		//private final ResourceLocation resource;
	
		
		private final int rain;
		private final int thunder;
		private final double factor;
		private final float angle;
		private final long sunrise;
		private final int seasonColor;
		private final int startChance;
		private final int endChance;
		
		
		
		 
		 
		private Season(String name,int startChance,int endChance, 
				int rain,int seasonColor, 
				double factor, float angle, long sunrise, 
				int thunder) {
			this.rain = rain;
			this.thunder = thunder;
			this.factor = factor;
			this.angle = angle;
			this.sunrise = sunrise;
			this.seasonColor = seasonColor;
			this.startChance = startChance;
			this.endChance = endChance;
		}

		public int getStartChance() {
			return startChance;
		}

		public int getEndChance() {
			return endChance;
		}

		public int getRain() {
			return rain;
		}

		public int getThunder() {
			return thunder;
		}


		public double getFactor() {
			return factor;
		}

		public float getAngle() {
			return angle;
		}

		public long getSunrise() {
			return sunrise;
		}


		public int getSeasonColor() {
			return seasonColor;
		}

		
}
