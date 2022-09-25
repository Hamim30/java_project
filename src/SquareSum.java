import java.util.Scanner;
public class SquareSum {
    public static void main(String[] args) {
        Scanner inputTake= new Scanner(System.in);
        int number = inputTake.nextInt();
        int sum=0;
        for (int i=1; i<=number; i++){
            if (i%2==0){
                sum-=Math.pow(i,2);
            }else {
                sum+=Math.pow(i,2);
            }
        }
        System.out.println(sum);
    }
}
