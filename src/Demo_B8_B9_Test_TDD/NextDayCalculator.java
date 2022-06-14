package Demo_B8_B9_Test_TDD;

public class NextDayCalculator {
    public static String getNextDay( int day,int month, int year){
        if (day == 31 && month == 12){
            day = 1;
            month = 1;
            year ++;
        }
        else if ((day == 31 && month == 1) || (day == 31 && month == 3) || (day == 31 && month == 5) ||
                (day == 31 && month == 7) || (day == 31 && month == 8) || (day == 31 && month == 10) ){
             day = 1;
             month ++;
        } else if ((day == 30 && month == 4) || (day == 30 && month == 6) || (day == 30 && month == 9) || (day == 30 && month == 11)) {
            day = 1;
            month ++;
        } else if ((NextDayCalculator.primeYear(year) && day == 29 && month == 2) || (!NextDayCalculator.primeYear(year) && day == 28 && month == 2) ) {
            day = 1;
            month ++;
        }
        else {
            day  ++;
        }
        return day + "/" + month + "/" + year;
    }
     public static boolean primeYear (int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                   return true;
                } else {
                    return false;
                }
            } else {
               return true;
            }
        } else {
            return false;
        }
    }
}
