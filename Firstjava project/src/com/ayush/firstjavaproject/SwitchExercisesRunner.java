package com.ayush.firstjavaproject;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfTheDay(0));
		// TODO Auto-generated method stub

	}

	public static String determineNameOfTheDay(int dayNumber) {
		String result = "";
		switch (dayNumber) {
		case 0:
			result = "Sunday";
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
		}

		return result;

	}

}
