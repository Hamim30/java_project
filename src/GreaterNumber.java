import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        float one = inputTake.nextFloat();
        float two = inputTake.nextFloat();
        if (one > two){
            System.out.println("Number one is greater");
        }
        else if (one< two){
            System.out.println("Number two is greater");
        }
        else{
            System.out.println("Both number are equal");
        }

    }

}
