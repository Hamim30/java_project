import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int number = inputTake.nextInt();
        for (int i=1;i <= number;i++){
            for (int j=1; j<= i ; j++){
                System.out.print(j);
            }System.out.println();
        }
    }
}
