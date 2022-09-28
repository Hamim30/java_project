import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int number = inputTake.nextInt();
        String plus= "+";
        for (int i=0 ;i<number;i++){
            System.out.println(plus.repeat(number));
        }
    }
}
