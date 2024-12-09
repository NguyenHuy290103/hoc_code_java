package video1_77;import java.util.Scanner;

public class bai17_vd1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời nhập n: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n==24){
                System.out.println("Kết quả: n=24");
            }
            else
                System.out.println("Kết quả: "+n+"!=24");
        }
    }
}
