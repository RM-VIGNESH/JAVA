package academy.learnprogramming;

public class Minutes_to_years_and_days {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes <0){
            System.out.println("Invalid Value");
        }
        long hour = minutes/60;
        long year = hour/8760;
        long remyears = hour%8760;
        long days = remyears/24;

        System.out.println(minutes + " min = " + year + " y and " + days + " d");
    }
}
