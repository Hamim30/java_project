import java.util.Scanner;

public class MultipleOf {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int number = inputTake.nextInt();
        System.out.println("TASK 1");
        if (number % 2 == 0 || number % 5 == 0) {
            System.out.println(number);
        } else {
            System.out.println("Not multiple of 2 or 5");
        }
        System.out.println("TASK 2");
        if (number % 2 == 0 && number % 5 == 0) {
            System.out.println("Multiple of both 2 and 5");
        } else if (number % 2 == 0 || number % 5 == 0) {
            System.out.println(number);
        } else {
            System.out.println("Not multiple of 2 or 5");
        }
        System.out.println("TASK 3");
        if (number % 2 == 0 && number % 5 == 0) {
            System.out.println(number);
        }else{
            System.out.println("Not multiple of 2 and 5");
        }


    }
}
