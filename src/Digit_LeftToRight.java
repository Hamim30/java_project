import java.util.Scanner;

public class Digit_LeftToRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int new_number;
        new_number = number;
        int count =0;
        while (number>0){
            count+=1;
            number= number/10;
        }
        while (new_number>0){
            int power= (int) Math.pow(10,count-1);
            int digit = new_number / power;
            new_number = new_number%power;
            count--;
            System.out.println(digit);

        }


    }
}