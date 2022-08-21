package academy.learnprogramming;

public class Number_Of_Days_In_Month {

    public static void main(String[] args) {
	isLeapYear(100000);
    }

    public static void isLeapYear(int year) {
        if (year <=1 && year >=9999){
            System.out.println(false);
        }else if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0){
            System.out.println(true);
        }
    }
}
