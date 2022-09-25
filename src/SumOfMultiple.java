public class SumOfMultiple {
    public static void main(String[] args) {
        int sum=0;
        int sumTwo=0;
        int sumThree=0;
        for (int i =0; i<=600;i++){
            if(i % 7==0 && i%9==0){
                sum+=i;
            }else if (i % 7==0 || i%9==0) {
                sumThree+=i;
            }
            if (i % 7==0 || i%9==0) {
                sumTwo+=i;
            }
        }
        System.out.println(sum);
        System.out.println(sumTwo);
        System.out.println(sumThree);
    }
}
