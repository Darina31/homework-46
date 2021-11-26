package QA.Course;

public class WorkWithConsole {
    public static void main(String[] args) {
     printdayoftheweek( 8);
    }

    {

    }

    public static void printdayoftheweek(int day) {
        String result = "Not valid day";
        if (day == 1) {
            result = "Day of the week is Monday";
        } else if (day == 2) {
            result = "Day of the week is Tuesday";
        } else if (day == 3) {
            result = "Day of the week is Wednesday";
        } else if (day == 4) {
            result = "Day of the week is Thursday";
        }else if (day == 5) {
            result = "Day of the week is Friday";
        }else if (day== 6){
            result = "Day of the week is Saturday";
        }else if (day == 7){
            result = "Day of the week is Sunday";
        }
        System.out.println(result);
    }

}





