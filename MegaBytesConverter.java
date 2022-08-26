public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int KiloBytes){
        // KB cant be 0 or less than 0....
        if (KiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int mega= KiloBytes/1024; // 1MB = 1024KB
            int bytes= KiloBytes % 1024; 

            System.out.println(KiloBytes + " KB = " + mega + " MB and " + bytes +" KB" );
        }
    }

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}
