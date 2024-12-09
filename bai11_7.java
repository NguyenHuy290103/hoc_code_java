package video1_77;
import java.util.Scanner;

public class bai11_7 {
    public static void main(String[] args) {
        /*Bài tập java 07: Viết chương trình cho người dùng
        nhập vào 1 tháng bất kỳ từ 1 - 12 => cho biết tháng đó có bao nhiêu ngày ?
        Gợi ý:

        Tháng 1,3,5,7,8,10,12 có 31 ngày
        Tháng 4,6,9,11 có 30 ngày

        Nếu tháng 2 thì yêu cầu nhập thêm năm:

        nếu năm nhuận thì tháng 2 có 29 ngày
        năm không nhuận thì tháng 2 có 28 ngày*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào tháng: ");
        int thang = sc.nextInt();

        if (thang == 4 || thang ==6 || thang ==9 || thang == 11){
            System.out.println("Tháng: "+thang+" có 31 ngày");
        }
        else if (thang == 2) {
            System.out.println("Mời nhập vào năm: ");
            int nam = sc.nextInt();
            if (((nam %4 ==0) && (nam %100 !=0)) || ( nam %400 ==0)){
                System.out.println("Năm: "+nam+ " là năm nhuận");
                System.out.println("Tháng 2 có 29 ngày");
            }
            else {
                System.out.println("Năm: " +nam+ " không phải là năm nhuận");
                System.out.println("Tháng 2 có 28 ngày");
            }
        }
        else if (thang == 1 || thang ==3 || thang ==5 || thang == 7 || thang == 8 || thang == 10 || thang == 12){
            System.out.println("Tháng: "+thang+" có 30 ngày");
        }
        else {
            System.out.println("Chỉ có 12 tháng trong 1 năm");
        }
    }
}
