package academy.learnprogramming;

public class Sum_even_digit {

    public static void main(String args[]){
        System.out.println(sumevendigit(252));
    }

    public static int sumevendigit(int number) {
        int sum = 0;

        while (number > 0)
        {
            if ((number % 10) % 2 == 0)
                sum = sum + number % 10;

            number = number / 10;
        }
        if(number>=0){
        return sum;
        }
        return -1;
    }

}
