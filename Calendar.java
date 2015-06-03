import android.content.res.Configuration;

public class Calendar {
			public static int DAYS_PER_SEASON;
			public static int TICKS_PER_DAY;
			private static Configuration config;
			
		public static void initConfiguration(Configuration config){
			DAYS_PER_SEASON = getInteger("Days per season",30);
			TICKS_PER_DAY = getInteger("Ticks per day", 15000);
		
		}

		private static int getInteger(String string, int i) {
			
			
			return i;
		}
}
