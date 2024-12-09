import java.util.Scanner;

public class bai17_vd3 {
    public static void main(String[] args) {
/*        Bài tập Java 14:
        Viết chương trình tính tổng các số lẻ từ 1 đến n, n nhập từ bàn phím
        Nhập n = 7, Bỏ qua cộng tổng với số 3 => in ra kết quả
        (gợi ý đáp án : 1+5+7 =13)
        Thử break khi vòng lặp chạy đến giá trị n=3*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập n: ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i= 1; i<=n; i+=2){
            if (i==3)
                break;
            else
                tong +=i;
        }
        System.out.println("Tổng các số lẻ từ 1 đến "+n+" = "+tong);
    }
}
