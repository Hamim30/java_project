import java.util.Scanner;

public class SalaryCal {
    public static void main(String[] args) {
        Scanner inputTake= new Scanner(System.in);
        int hours=inputTake.nextInt();
        if (hours <= 40 && hours>=0){
            System.out.println(hours*200);
        } else if (hours>40) {
            System.out.println(8000+(hours-40)*300);
        }
        else {
            System.out.println("Error number");
        }
    }
}
