package academy.learnprogramming;

public class Decimal_comparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.444, 3.4445546546484));
    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        int num1 = (int) (x * 1000);
        int num2 = (int) (y * 1000);

        if (num1 == num2) {
            return true;
        }
        return false;
    }
}
