package video1_77;public class bai17_breakContinue {
    public static void main(String[] args) {
        //Tính tổng các số từ 1 đến 5 bỏ quá 3
        int tong = 0;
        for(int i =1; i<=5; i++){
            if (i==3){
                continue;// bỏ qua i= 3
            }
            else
                tong+=i;
        }
        System.out.println("Tổng= " +tong);

        int n=0;
        while (n<100){
            System.out.println("n= "+n);
            if(n==20){
                break;
            }
            else
                 n++;
        }
    }
}
