package algorithm_programs;

import utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = Utility.dayOfWeek();
		String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println("day->"+week[day]);
	}

}
