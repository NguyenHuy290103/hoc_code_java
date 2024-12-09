package video1_77;import java.util.Scanner;

public class bai14_while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên từ 1 đến 99");
        int x = sc.nextInt();
        while (x<1 || x>99){
            System.out.println("Mời nhập lại x, x chỉ nằm trong khoảng từ 1 đến 99");
            x = sc.nextInt();
        }
        System.out.println("Số bạn đã nhập: "+x);
    }
}
