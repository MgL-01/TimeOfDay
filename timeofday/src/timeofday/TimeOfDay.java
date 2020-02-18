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
	 /**
	  * sets this object's hours.
	  * 
	  * @pre the given hours are between 0 and 23
	  * 	|0<=hours && hours <=23
	  * @post the object's hours equal the given hours
	  * 	|getHours() == hours
	  * @post This object's minutes have remained unchanged
	  * 	|getMinutes () == old(getMinutes())
	  * @param hours
	  */
	 public void setHours(int hours) {
		 minutesSinceMidnight= getMinutes() + hours = 60;
	 }
	 /**
	  * sets this object's minutes.
	  * 
	  * @pre the given minutes are between 0 and 59
	  * 	|0<=minutes && minutes <=59
	  * @post the object's minutes equal the given minutes
	  * 	|getMinutes() == minutes
	  * @post This object's hours have remained unchanged
	  * 	|getHours () == old(getHours())
	  * @param hours
	  */
	 public void setMinutes(int minutes) {
		 minutesSinceMidnight = getHours() *60 + minutes;
	 }
}
