import  java.util.Scanner;
public class UptoSum {
    public static void main(String[] args) {
        Scanner inputTake= new Scanner(System.in);
        int number=inputTake.nextInt();
        int sum=0;
        for (int i =7;i<=number;i+=7){
            sum+=i;
        }
        System.out.println(sum);
    }
}
