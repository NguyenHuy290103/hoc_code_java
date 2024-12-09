package video1_77;import java.util.Scanner;

public class bai17_vd2 {
    public static void main(String[] args) {
        /*Bài tập Java 13:
        Viết chương trình nhập số a từ bàn phím,
        Nếu a chẵn thì tính tổng các số chẵn từ 0 đến a
        Nếu a lẻ thì in ra dòng chữ "tôi o tính tổng số lẻ, bye bye " và thoát chương trình*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số a: ");
        int a = sc.nextInt();
        int tong = 0;
        if (a%2 != 0){
            System.out.println("tôi o tính tổng số lẻ, bye bye");

        }
        else {
            for (float i = 0; i <= a; i += 2) {
                tong += i;
            }
            System.out.println("Tổng= "+tong);
        }
    }
}
