import java.util.Scanner;
public class FavouriteCar {
    public static void main(String[] args) {
        Scanner inputTake =new Scanner(System.in);
        String userInput= inputTake.nextLine();
        int number = inputTake.nextInt();
        for (int i=0 ;i < number; i++ ){
            System.out.println(userInput);
        }

    }
}
