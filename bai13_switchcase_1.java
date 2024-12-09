package video1_77;import java.util.Scanner;

public class bai13_switchcase_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số để tìm kiếm: ");
        System.out.println("1. Tìm theo tên");
        System.out.println("2. Tìm theo tác giả");
        System.out.println("3. Tìm theo nhà xuất bản");
        System.out.println("4. Tìm theo tiêu đề");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Tìm theo tên");
                break;
            case 2:
                System.out.println("Tìm theo tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
            default:
                System.out.println("Phím bấm không hợp lệ");
        }
    }
}
