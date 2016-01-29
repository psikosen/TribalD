package Calandar;

public class CalendarServer implements IDate{
	private boolean loaded = false;
	int day;
	Season season;
	private CalendarDate date = new CalendarDate(0,Season.SPRING,1);
				
	public CalendarDate getDate(){
		return date;
		
	}	
	
	
	
	public boolean newDay(){
		int day = date.getDay();
		Season season = date.getSeason();
		int year = date.getYear();
		
		
		if(day < Calendar.DAYS_PER_SEASON){
			day++;
		} else{
			season = getNextSeason();
			day = 1;
			if(season == Season.SPRING){
				year++;
			}
		}
		date.setDay(day).setSeason(season).setYear(year);
		//Potentially add to main game
		//sendToEveryOne(new PacketSetCalendar(date));
		//PlantHelper.newDay();
		
		/*for(EntitiyPlayer player :(List<EntityPlayer>))*/
		//pLAYERhELPER.getDate(player.newDay()
		loaded = true;
		
		return true;
	}
	
	private Season getNextSeason() {
		// Skipps to the next season
		return date.getSeason().ordinal() < Season.values().length -1 ? Season.values()[date.getSeason().ordinal() + 1] : Season.values()[0];
	}


	// sets the date
	public void setDate(int day, Season season, int year){
		date.setDay(day).setSeason(season).setYear(year);
	}
	
				
	@Override
	public int getDay() {
		// Grabs the data information
		return day;
	}

	@Override
	public Season getSeason() {
		//Grabs Season
		return season;
	}

}
