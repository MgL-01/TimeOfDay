package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay();
		assert myTimeOfDay.getHours(myTimeOfDay) == 0;
		assert myTimeOfDay.getMinutes( myTimeOfDay) == 0;
		myTimeOfDay.setHours(myTimeOfDay, 12);
		myTimeOfDay.setMinutes (myTimeOfDay, 45);
		assert myTimeOfDay.getHours(myTimeOfDay) == 12;
		assert myTimeOfDay.getMinutes( myTimeOfDay) == 45;
	}

}
