package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(6, 4, 2018);
		tomorrow = new Date(7, 4, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));
		System.out.println("Today's month is: " + today.getMonthName());
		System.out.println("Today's month day is: " + today.isMonthDayOk());
		System.out.println("Today's season is: " + today.dateSeason());
		System.out.println("This months left untill year's end: " + today.monthsLeft());
		System.out.println(today.printDate() + " is a date");
		System.out.println("Dates remaining until the end of the month: " + today.datesLeft());
		System.out.println("Months with the same days as this month: " + today.monthsWithSameDays());
		System.out.println("Days since the start of the year: " + today.daysSinceNewYear());
		System.out.println("Number of attemps to generate tomorrows's date randomly: " + tomorrow.randomAttemps1());
		System.out.println("Number of attemps to generate tomorrows's date randomly: " + tomorrow.randomAttemps2());
		System.out.println("Name of tomorrows's day of the week: " + tomorrow.nameOfTodaysDay());
	}

}
