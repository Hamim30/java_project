import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int number = inputTake.nextInt();
        int summ=0;
        for (int i=1; i < number;i++){
            if (number % i==0){
                summ+=i;
            }
        }
        if (summ==number ){
            System.out.println("It is a perfect Number");
        }else {
            System.out.print("Not a perfect Number");
        }
    }
}
