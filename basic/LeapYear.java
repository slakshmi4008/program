package basic;

import java.util.Calendar;

public class LeapYear {
	public static void main(String[] args) {
		boolean ans = isLeapYear(1901);
		isLeapCal(2000);
		System.out.println(ans);
	}

	private static void isLeapCal(int i) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, i);
		int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		if (noOfDays > 365)
			System.out.println(true);
		else
			System.out.println(false);

	}

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return (year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0);
	}

}
