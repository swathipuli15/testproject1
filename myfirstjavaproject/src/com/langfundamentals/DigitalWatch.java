package com.langfundamentals;

public class DigitalWatch {
	String brandName;
	String watchType;
	int hours;
	int minutes;
	int seconds;
	int price;

	void displayTime() {
		System.out.println("Hours:" + hours);
		System.out.println("Minutes:" + minutes);
		System.out.println("Seconds:" + seconds);
		System.out.println("Watch Time:" + hours + ":" + minutes + ":" + seconds);

	}

	void displayWatchDetails() {
		System.out.println("Brand Name:" + brandName);
		System.out.println("Watch Type:" + watchType);
	}

	void updateHour() {
		hours++;
		System.out.println(" Updated hours:" + hours);

	}

	void updateMinutes() {
		minutes += 5;
		System.out.println("Upadate Minutes:" + minutes);
		minutes += 5;
	}

	public static void main(String[] args) {
		DigitalWatch d = new DigitalWatch();
		DigitalWatch d1 = new DigitalWatch();
		d.hours =10;
		d.minutes = 11;
		d.seconds = 30;
		d.brandName = "apple";
		d.watchType = "Anolag";
		d1.hours = 9;
		d1.minutes = 9;
		d1.seconds = 30;
		d1.brandName = "Boat";
		d1.watchType = "Smart";

		d.displayTime();
		d.displayWatchDetails();
		d.updateHour();
		d.updateMinutes();
		d1.displayTime();
		d1.displayWatchDetails();
		d1.updateHour();
		d1.updateMinutes();


	}

}
