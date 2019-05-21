public class APCalendar {
    private static boolean isLeapYear(int year){
        if(year() == 366){
            return true;
        }
        return false;
    }
    public static int numberOfLeapYears(int year1, int year2){
        int sum = 0;
        for(int i=year1; i <= year2; i++){
            if(isLeapYear(i)){
                sum++;
            }
        }
        return sum;
    }
    private static int firstDayOfTheYear(int year){

    }
    private static int dayOfYear(int month, int day, int year){
        
    }
}
