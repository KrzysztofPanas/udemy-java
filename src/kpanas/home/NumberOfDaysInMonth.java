package kpanas.home;

public class NumberOfDaysInMonth {
    public static int getDaysInMonth(int month, int year) {
        int numberOfdays = -1;
        if (month >=1 && month <=12 && year >= 1 && year <= 9999){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: numberOfdays = 31; break;
                case 2:
                    if (isLeapYear(year)) {
                        numberOfdays = 29;
                    } else numberOfdays = 28; break;
                case 4: case 6: case 9: case 11: numberOfdays = 30; break;
                default: numberOfdays = -1; break;
            }
        }
        return numberOfdays;
    }

    public static boolean isLeapYear(int year) {
        boolean isItLeap = false;
        if (year >= 1 && year <= 9999){
            if (year%4 == 0 && year%100 != 0) {
                isItLeap = true;
            } else if (year%400 == 0){
                isItLeap = true;
            }
        }
        return isItLeap;
    }
}
