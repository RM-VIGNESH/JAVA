package academy.learnprogramming;

public class First_and_last_digit_sum {

    public static void main(String[] args) {
        System.out.println(SumFirstAndLastDigit(1225));
    }

    public static int SumFirstAndLastDigit(int number) {

        int last= number%10;
        int first = 0;


       while(number >=10) {
           first= number /= 10;

       }
       if(number <0 ){
           return -1;
       }else {
           int sum = last + first;
           return sum;
       }
    }
}
