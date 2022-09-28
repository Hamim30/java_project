import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int number = inputTake.nextInt();
        String binary = "1";
        while (number/2!=0){
            binary+=Integer.toString(number%2);
            number=number/2;
        }
        System.out.print(binary);

    }
}
