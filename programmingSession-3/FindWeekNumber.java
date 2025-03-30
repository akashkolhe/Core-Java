import java.util.Scanner;

public class FindWeekNumber {
    static int day,month;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1="6th january 2019";
        String[] mon=str1.split(" ");
        String str=mon[1];
        System.out.println(str);
        String str2="tuesday";
        str=str.toLowerCase();
        str2=str2.toLowerCase();
        switch (str) {
            case "january":
                month=1;
                break;
            case "february":
                month=2;
                break;
            case "march":
                month=3;
                break;
            case "april":
                month=4;
                break;
            case "may":
                month=5;
                break;
            case "jun":
                month=6;
                break;
            case "july":
                month=7;
                break;
            case "august":
                month=8;
                break;
            case "september":
                month=9;
                break;
            case "october":
                month=10;
                break;
            case "november":
                month=11;
                break;
            case "december":
                month=12;
                break;
            default:System.out.println("Invalid Month");
                break;
        }
        switch (str2) {
            case "monday":
                day=1;
                break;
            case "tuesday":
                day=2;
                break;
            case "wednesday":
                day=3;
                break;
            case "thursday":
                day=4;
                break;
            case "friday":
                day=5;
                break;
            case "saturday":
                day=6;
                break;
            case "sunday":
                day=7;
                break;
            default: System.out.println("invalid Day");
                break;
        }
        int week=365/7;
        // week=week/4;
        int a=month*4;
        System.out.println(a);
        System.out.println(week);

    }
}
