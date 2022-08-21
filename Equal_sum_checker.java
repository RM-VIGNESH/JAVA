package academy.learnprogramming;

public class Equal_sum_checker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,1,5));
    }

    public static boolean hasEqualSum(int x,int y,int z) {
        if (x + y == z) {
            return true;
        }

        return false;

    }
}
