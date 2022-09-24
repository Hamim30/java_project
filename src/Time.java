import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int number = inputTake.nextInt();
        int hour = (number/3600);
        int minute = (number % 3600)/60;
        int second = (number % 3600)% 60;
        System.out.println(hour + " Hours");
        System.out.println(minute + " Minutes");
        System.out.println(second + " Seconds");
    }
}
