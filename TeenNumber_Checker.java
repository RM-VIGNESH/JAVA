package academy.learnprogramming;

public class TeenNumber_Checker {

    public static void main(String[] args) {
        System.out.println(hasTeen(3,2,13));
        System.out.println(isTeen(15));
    }

    public  static boolean hasTeen (int x , int y , int z){
        if (x>= 13 && x<=19){
            return true;
        }
        if (y >= 13 && y <= 19){
            return true;
        }
        if (z >= 13 && z <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen (int a){
        if (a >=13 && a <=19){
            return true;
        }
        return false;
    }
}
