package TimeOfDa;

public class TimeOfDay {
	private int MinutesSinceMidnight;

	public TimeOfDay(int hours, int minutes) {
		MinutesSinceMidnight = hours*60 + minutes;
	}

	public int getHours() {
		return MinutesSinceMidnight / 60;
	}

	public int getMinutes() {
		
		return MinutesSinceMidnight %60 ;
	}
	
}
