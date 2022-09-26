import java.util.Scanner;

public class Digit_LeftToRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int temp;
        temp = number;
        int count =0;
        while (number!=0){
            count++;
            number= number/10;
        }
        while (temp!=0){
            int power= (int) Math.pow(10,count-1);
            int digit = temp/ power;
            temp = temp%power;
            count--;
            System.out.println(digit);

        }


    }
}