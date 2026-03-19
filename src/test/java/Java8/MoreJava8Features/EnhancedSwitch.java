package Java8.MoreJava8Features;

import java.time.Month;
import java.time.Year;

public class EnhancedSwitch {
    //in JAVA 17 I guess..
    //switch is used as an expresession..
    //this can also be combined with pattern matcher..
    public static void main(String[] args) {

    }

    public static int switchOldWay(Month month, int year){
        int noOfDays = 0;
        switch (month){
            case SEPTEMBER:
            case APRIL:
            case JUNE:
            case NOVEMBER:
                noOfDays = 30;
                return noOfDays;
            case FEBRUARY:
                 noOfDays = Year.isLeap(year) ? 29 : 28;
                 return noOfDays;
            default:
                noOfDays = 31;
                return noOfDays;
        }
    }

    public static int switchEnhancedWayOne(Month month, int year){
        int noOfDays = 0;
        switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> {
                //this is a lambda..
                noOfDays = 30;
                return noOfDays;
            }
            case FEBRUARY -> {
                noOfDays = Year.isLeap(year) ? 29 : 28;
                return noOfDays;
            }
            default -> {
                noOfDays = 31;
                return noOfDays;
            }
        }
    }

// so we 're using lambda inside the case system now...
    public static int switchEnhancedWayTwo(Month month, int year){
        return switch (month) {
            case SEPTEMBER, APRIL, JUNE , NOVEMBER -> 30;
            case FEBRUARY -> Year.isLeap(year) ? 29 : 28 ;
            default -> 31;
        };

    }


}
