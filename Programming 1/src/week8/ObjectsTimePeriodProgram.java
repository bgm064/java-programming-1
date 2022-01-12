package week8;

import java.util.Scanner;

public class ObjectsTimePeriodProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TimePeriod period = new TimePeriod();

        System.out.println(period);

        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter hours to add: ");
            int hours = Integer.parseInt(input.nextLine());
            
            System.out.print("Enter minutes to add: ");
            int minutes = Integer.parseInt(input.nextLine());

            period.addHours(hours);
            period.addMinutes(minutes);
            
            System.out.println(period);
            System.out.println();
        }
        
        input.close();
    }
}


class TimePeriod {

	private int hours;
	private int minutes;

	public TimePeriod() {
		hours = 0;
		minutes = 0;
	}

	public void addHours(int hoursToAdd) {
		if (hoursToAdd > 99) {
			hoursToAdd = 0;
		} else if (hoursToAdd >= 0) {
			this.hours = hours + hoursToAdd;
		}
		if (hoursToAdd > 99) {
			hours -= hoursToAdd;
		}
	}

	public void addMinutes(int minutesToAdd) {
		if (minutesToAdd > 59) {
			minutesToAdd = 0;
		} else if (minutesToAdd >= 0 && minutesToAdd < 60) {
			this.minutes = minutes + minutesToAdd;
		}
		if (hours == 99 && minutes > 59) {
			minutes -= minutesToAdd;
		}
	}

	public String toString() {
		if (minutes >= 60) {
			hours += 1;
			minutes -= 60;
		}
		if (hours > 99) {
			hours = 99;
		}
		return hours + " h " + minutes + " min";
	}

}