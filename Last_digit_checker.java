package academy.learnprogramming;

public class Last_digit_checker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,9999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        int num1last = num1%10;
        int num2last = num2%10;
        int num3last = num3%10;

        if((num1 < 10 && num1 > 1000) && (num2 < 10 && num2 > 1000) && (num3 < 10 && num3 > 1000)){
            return false;
        }
        if(num1last==num2last || num1last==num3last || num2last==num3last){
            return true;
        }else{
            return false;
        }
    }
}
