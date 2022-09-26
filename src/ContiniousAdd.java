import java.util.Scanner;
public class ContiniousAdd {
    public static void main(String[] args) {
        Scanner inputTake = new Scanner(System.in);
        int sum =0;
        for (int i=0;i<5;i++){
            int a_num= inputTake.nextInt();
            sum+=a_num;
            System.out.println(sum);
        }
    }
}
