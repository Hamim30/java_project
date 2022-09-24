import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int userInput = inputTake.nextInt();
        if (userInput%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number ");
        }
    }
}
