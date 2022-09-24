import java.util.Scanner;

public class SubstractGreater {
    public static void main(String[] args) {
        Scanner inputTake= new Scanner(System.in);
        float one=inputTake.nextFloat();
        float two=inputTake.nextFloat();
        if (one>two){
            System.out.println(one-two);
        }
        else if(one<two){
            System.out.println(two-one);
        }
        else{
            System.out.println(0);
        }
    }
}
