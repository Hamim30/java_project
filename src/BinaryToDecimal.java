import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        String binary = inputTake.nextLine();
        int decimal = 0;
        int count = binary.length();
        for (int i = 0; i < binary.length(); i++) {
            char b = binary.charAt(i);
            if (b == '1') {
                decimal += (int) Math.pow(2, count - 1);

            }
            count--;

        }
        System.out.print(decimal);
    }
}
