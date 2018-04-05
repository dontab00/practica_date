package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}

	public int getMonth(){
		return this.month;
	}

	public int getDay(){
		return this.day;
	}

	public String getMonthName(){
		String monthsName="";
		switch (this.month){
			case 1:
				monthsName= "January";
			break;
			case 2:
				monthsName= "February";
			break;
			case 3:
				monthsName= "March";
			break;
			case 4:
				monthsName= "April";
			break;
			case 5:
				monthsName= "May";
			break;
			case 6:
				monthsName= "June";
			break;
			case 7:
				monthsName= "July";
			break;
			case 8:
				monthsName= "August";
			break;
			case 9:
				monthsName= "September";
			break;
			case 10:
				monthsName= "October";
			break;
			case 11:
				monthsName= "November";
			break;
			case 12:
				monthsName= "December";
			break;
		}
		return monthsName;
	}

	boolean isSameYear(Date another){
		if (this.year == another.getYear()){
			return true;
		}
		return false;
	}

	boolean isSameMonth(Date another){
		if (this.month == another.getMonth()){
			return true;
		}
		return false;
	}
	
	boolean isSameDay(Date another){
		if (this.day == another.getDay()){
			return true;
		}
		return false;
	}

	boolean isSame(Date another){
		if (this.day == another.getDay() && this.month == another.getMonth() && this.year == another.getYear()){
			return true;
		}
		return false;
	}

	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

	public boolean isMonthDayOk(){
		boolean isMonthsDayOk=false;
			switch (this.month){
				case 1:
					if (this.day<0 || this.day>31){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 2:
					if (this.day<0 || this.day>28){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 3:
					if (this.day<0 || this.day>31){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 4:
					if (this.day<0 || this.day>30){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 5:
					if (this.day<0 || this.day>31){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 6:
					if (this.day<0 || this.day>30){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 7:
					if (this.day<0 || this.day>31){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 8:
					if (this.day<0 || this.day>31){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 9:
					if (this.day<0 || this.day>30){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 10:
					if (this.day<0 || this.day>31){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 11:
					if (this.day<0 || this.day>30){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
				case 12:
					if (this.day<0 || this.day>31){
						isMonthsDayOk=false;
					}
					else {
						isMonthsDayOk=true;
					}
				break;
			}
		return isMonthsDayOk;
	}

	public String dateSeason(){
		String season="";
		switch (this.month){
			case 1:
				season= "Winter";
			case 2:
				season= "Winter";
			case 3:
				season= "Winter";
			break;
			case 4:
				season= "Spring";
			case 5:
				season= "Spring";
			case 6:
				season= "Spring";
			break;
			case 7:
				season= "Summer";
			case 8:
				season= "Summer";
			case 9:
				season= "Summer";
			break;
			case 10:
				season= "Autumn";
			case 11:
				season= "Autumn";
			case 12:
				season= "Autumn";
			break;
		}
		return season;
	}

	public String monthLeft(){
		StringBuilder months = new StringBuilder();
		for (int i=this.month;i<=12;i++){
			this.month = this.month+1;
			months.append(this.getMonthName()).append(" ");
		}
		return months.toString();
	}
}
