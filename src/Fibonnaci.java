import java.util.Scanner;
public class Fibonnaci {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int number = inputTake.nextInt();
        int first =0;
        System.out.print(first);
        int second =1;
        System.out.print(" "+second);
        int sum ;
        for (int i =0;i<number;i++){
            sum=first+second;
            System.out.print(" "+sum);
            first=second;
            second=sum;
        }
    }
}
