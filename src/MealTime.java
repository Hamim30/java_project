import java.util.Scanner;
public class MealTime {
    public static void main(String[] args) {
        Scanner inputTake= new Scanner(System.in);
        int hours=inputTake.nextInt();
        if (hours<0 || hours>23){
            System.out.println("Wront time");
        }
        else if (hours>=4 && hours<=6){
            System.out.println("Breakfast time");
        } else if (hours==12 || hours==13 ) {
            System.out.println("Lunch time");
        } else if (hours==16 || hours ==17) {
            System.out.println("Snacks time");
        } else if (hours==19 || hours==20) {
            System.out.println("Dinner time");
        }else {
            System.out.println("patience is a virtue");
        }
    }
}
