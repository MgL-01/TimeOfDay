package timeofday;

/** 
 * Instances of this class store a time of day.
 * @invar The hours are between 0 and 23
 * 		|0<= getHours() && getHours()<=23
 * @invar The minutes are between 0 and 59
 * 		|0<= getMintes() && getMinutes()<59
 *
 */

public class TimeOfDay {
	/**
	 * @invar minutessincemidnight between 0 and 24*60
	 * 		|0<= minutesSinceMidnight && minutesSinceMidnight <24*60
	 */
	private int minutesSinceMidnight;
	public int getHours() {
		return minutesSinceMidnight/60;
		}
	 public int getMinutes() {
		 return minutesSinceMidnight % 60;
		 }
	 public TimeOfDay(int hours, int minutes) {
		 minutesSinceMidnight = hours *60 +minutes
	 }
	 /**
	  * Initializes this instane with given hours and minutes
	  * @pre The given hours betwen 0 and 23
	  * @pre given min between 0 and 59
	  * @post instance's hours equal given hours
	  * @post instance's hours equal given minutes
	  */
}
