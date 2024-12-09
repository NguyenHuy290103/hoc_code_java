
package video1_77;
import java.util.Scanner;

public class bai11_ifelse {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào điểm trung bình: ");
        double dtb = sc.nextDouble();*/
        /*if (dtb >= 5){
            System.out.println("Bạn đã đỗ");
            System.out.println("chúc mừng bạn");
        }
        else {
            System.out.println("bạn đã trượt");
        }*/
        /*if (dtb >=8 && dtb <= 10){
            System.out.println("Chúc mừng bạn");
            System.out.println("Bạn là học sinh giỏi!");
        }
        else if (dtb >= 6 && dtb < 8) {
            System.out.println("chúc mừng bạn ");
            System.out.println("Bạn là học sinh khá");
        }
        else if (dtb >=4 && dtb <6){
            System.out.println("Bạn là học sinh trung bình");
        }
        else {
            System.out.println("bạn là học sinh kém");
        }*/

        int x;
        int y;
        //bai tap
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tổng 2 số");
        double tong = sc.nextDouble();
        System.out.println("Nhập vào hiệu hai số");
        double hieu = sc.nextDouble();

        if(tong >=0){
            System.out.println("Giá trị x cần tìm là: "+ ((double)(tong+hieu)/2));
            System.out.println("Giá trị y cần tìm là: "+ (tong-(tong+hieu)/2));
        }

    }
}
