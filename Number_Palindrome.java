package academy.learnprogramming;

public class Number_Palindrome {

    public static void main(String[] args){
        System.out.println(isPalindrome(1221));    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int orginalnumber = number;
        while(number!=0 ){
            int lastdigit= number%10;
            reverse= reverse*10 + lastdigit;
            number /= 10;
        }
        if ( orginalnumber == reverse){
            return true;
        }else {
        return false;}
    }
}
