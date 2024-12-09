package video1_77;import java.util.Scanner;

public class bai12_toantubangoi {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số: ");
        int a = sc.nextInt();
        String traloi = (a%2 ==0)? "chẵn" : "lẻ";
        System.out.println("Số "+a+" là số "+traloi);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập điểm: ");
        double a =sc.nextDouble();
        String traloi = (a <=10 &&a >= 8)? "Giỏi" :
                ((a < 8 && a >= 6.5)? "Khá" :
                        (a < 6.5 && a >= 5)? "Trung bình":
                                (a < 5 && a>=0)? "yếu":"Vui lòng nhập điểm từ 0 đến 10");
        System.out.println("kết quả xếp loại: "+traloi);
    }
}
