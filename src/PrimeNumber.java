import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int number = inputTake.nextInt();
        int checker=0;
        for (int i =2; i<number;i++){
            if (number %i==0){
                System.out.println("Not a prime number");
                checker=1;
                break;
            }
        }
        if (checker==0){
            System.out.println("Prime number");
        }
    }
}
