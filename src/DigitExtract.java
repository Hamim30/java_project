import java.util.Scanner;
public class DigitExtract {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int user = inputTake.nextInt();
        while ((user%10)!=0){
            int digit= user %10;
            System.out.print(digit+ " ");
            user= user/10;
        }
    }
}
