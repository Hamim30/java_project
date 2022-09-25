import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner inputTake= new Scanner(System.in);
        float one = inputTake.nextFloat();
        if (one < 0 || one >100){
            System.out.println("Error Number");
        } else if (one >=90) {
            System.out.println("Grade A");
        }else if (one >=80) {
            System.out.println("Grade B");
        }else if (one >= 70) {
            System.out.println("Grade C");
        }else if (one >=60) {
            System.out.println("Grade D");
        }else if (one >=50) {
            System.out.println("Grade E");
        }else if (one <50) {
            System.out.println("Grade F");
        }
    }
}
