import java.util.Scanner;

public class CircleAC {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        float radius = inputTake.nextFloat();
        System.out.println("Area:");
        System.out.println(3.1416*radius*radius);
        System.out.println("Circumference:");
        System.out.println(3.1416*2*radius);
    }
}
