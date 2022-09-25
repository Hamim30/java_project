import java.util.Scanner;
public class OddNumAverage {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int sum =0;
        int counter=0;
        int user_input;
        for (int i=0;i<10;i++){
            user_input=  inputTake.nextInt();
            if (user_input%2==1){
                sum+=user_input;
                counter+=1;
            }
        }
        System.out.println(sum/counter);
    }
}
