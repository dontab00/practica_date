package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(3, 4, 2018);
		tomorrow = new Date(4, 4, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));
		System.out.println("Today's month is: " + today.getMonthName());
		System.out.println("Today's month day is: " + today.isMonthDayOk());
		System.out.println("Today's season is: " + today.dateSeason());
		System.out.println("This months left untill year's end: " + today.monthLeft());
	}

}
