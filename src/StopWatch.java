import java.util.Scanner;

public class StopWatch {
    public static void main (String[] args){
        Scanner keybd = new Scanner(System.in);
        int limit, hour, minitue, sec = 0;

        System.out.println("Enter a time in minutes: ");
        limit = keybd.nextInt();

        if (limit > 0) {
            hour = limit / 60;
            minitue = limit % 60;

            do {
            // while (hour >= 0) { // need to change this to  do while
              while (minitue > 0) {
                    minitue -= 1;
                    sec += 60;
                    while (sec >= 0) {
                        if (hour > 0)
                           // System.out.println(hour + ":" + minitue + ":" + sec);
                            System.out.printf("%02d:%02d:%02d\n", hour, minitue, sec);
                        else
                            //System.out.println(minitue + ":" + sec);
                            System.out.printf("%02d:%02d\n", minitue, sec);
                        sec -= 1; // in cobol, I'd do a pause for a second
                    }
                }
                if (hour > 0) {
                    minitue += 60;
                }
                hour -= 1;
                } while (hour >= 0);
            System.out.println("Time over!");
        }
    }
}
