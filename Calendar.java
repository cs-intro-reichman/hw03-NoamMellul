public class Calendar {
    static int dayOfMonth = 1;
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;     // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January

    public static void main(String args[]) {
        // Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
        // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
        // The following variable, used for debugging purposes, counts how many days were advanced so far.
        int year1 = Integer.parseInt(args[0]);
        int debugDaysCounter = 0;
        //// Write the necessary initialization code, and replace the condition
        //// of the while loop with the necessary condition
        while (true) {
            //// Write the body of the while

            advance();
            if (year == year1){
                System.out.print(dayOfMonth + "/");
                System.out.print(month + "/");
                System.out.print(year);
                if (dayOfWeek == 1){
                    System.out.print(" Sunday");
                }
                System.out.println();
                debugDaysCounter++;


                if((debugDaysCounter >= 365) && (isLeapYear(year1) == false))  {
                    break;
                }
                if((debugDaysCounter >= 366) && (isLeapYear(year1) == true))  {
                    break;
                }
            }

            //// If you want to stop the loop after n days, replace the condition of the
            //// if statement with the condition (debugDaysCounter == n)

        }

    }

    //// Write the necessary ending code here


    private static void advance() {
        // Replace this comment with your code

        dayOfWeek %= 7;
        dayOfWeek++;
        if(dayOfMonth < nDaysInMonth){ // checks if month hasn't ended
            dayOfMonth++;
        }
        else { // month ended
            dayOfMonth = 1;
            month++;
            nDaysInMonth = nDaysInMonth(month, year);

            if(month == 13){ // checks if year has ended
                month = 1;
                year++;
                nDaysInMonth = nDaysInMonth(month, year);
            }
        }
    }

    // Returns true if the given year is a leap year, false otherwise.
    private static boolean isLeapYear(int year) {
        // Replace the following statement with your code
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // Leap year
        }
        else {
            return false; // Common year
        }
    }

    // Returns the number of days in the given month and year.
    // April, June, September, and November have 30 days each.
    // February has 28 days in a common year, and 29 days in a leap year.
    // All the other months have 31 days.
    private static int nDaysInMonth(int month, int year) {
        // Replace the following statement with your code
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)){
            return 30;
        }
        else if (month == 2){
            if (isLeapYear(year) == true){
                return 29;
            }
            else {return 28;}
        }
        else {return 31;}

    }
}

