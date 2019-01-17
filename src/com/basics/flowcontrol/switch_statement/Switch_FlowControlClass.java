package com.basics.flowcontrol.switch_statement;

public class Switch_FlowControlClass {

	public static void main(String[] args) {

		 // Switch -Statement
        int day = 6;
        String DayString;
        switch (day) {
            case 1:
                DayString = "Sunday";
                break;
            case 2:
                DayString = "Monday";
                break;
            case 3:
                DayString = "Tuesday";
                break;
            case 4:
                DayString = "Wednesday";
                break;
            case 5:
                DayString = "Thursday";
                break;
            case 6:
                DayString = "Friday";
                break;
            case 7:
                DayString = "Saturday";
                break;
            default:
                DayString = "Invalid day";
                break;
        }
        System.out.println(DayString);
    }
	

}
