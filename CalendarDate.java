package Calandar;

public class CalendarDate implements IDate {
		private int day;
		private Season season;
		private int year;
		
		public CalendarDate(){}
		
		public CalendarDate(int day, Season season, int year){
				this.day = day;
				this.season = season;
				this.year = year;
			
		}
		public CalendarDate(CalendarDate date){
			this.season = date.season;
			
		}
		public CalendarDate setDay(int day){
			this.day = day;
			return this;
		}
		public CalendarDate setSeason(Season season){
			this.season=season;
			return this;
			
		}
		public boolean isSet(){
			return season != null && day !=0 && year !=0;
			
		}
	
		
		
	@Override
	public int getDay() {
		// TODO Auto-generated method stub
		return day;
	}

	@Override
	public Season getSeason() {
		// TODO Auto-generated method stub
		return season;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null)return false;
		if(getClass() != obj.getClass()) return false;
		CalendarDate other = (CalendarDate)obj;
		if(day != other.day) return false;
		if(season != other.season) return false;
		if(year!= other.year) return false;
		
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void setYear(int year) {
		this.year = year;;
	}

	public int getYear() {
		// TODO Auto-generated method stub
		return year;
	}
	
	

}
