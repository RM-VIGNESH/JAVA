package academy.learnprogramming;

public class HoursMinAndSeconds {

    public static void main(String[] args) {
        System.out.println(getDurationString(1250,30));
        System.out.println(getDurationString(3546));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds >59){
            return "Invalid Value";
        }

            int hours = minutes / 60;
            int min = minutes % 60;

            String hourstring = hours + "h";
            if (hours < 10 ){
                hourstring = "0" + hourstring;
            }

        String minutestring = min + "m";
        if ( min< 10 ){
            minutestring = "0" + minutestring;
        }

        String secondstring = seconds + "s";
        if ( seconds< 10 ){
            secondstring = "0" + secondstring;
        }

            return hourstring+" "+minutestring+" "+secondstring+" ";
        }

        public static String getDurationString( int seconds){
        if (seconds<0){
            return "Invalid Value";
        }
        int remSec = seconds/60;
        int humSec = seconds%60;

        return getDurationString( remSec , humSec);
        }

    }


