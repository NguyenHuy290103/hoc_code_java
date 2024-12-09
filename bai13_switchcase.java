package video1_77;import java.util.Scanner;

public class bai13_switchcase {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào một số nguyên: ");
        int a = sc.nextInt();
        int div = a%2 ;
        switch (div){
            case 0:
                System.out.println("Số "+a+" là số chẵn");
                break;
            default:
                System.out.println("Số "+a+" là số lẻ");
        }*/

        //Nhập vào tháng kiểm tra tháng đó có bao nhiêu ngày
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào tháng cần tìm");
        int thang = sc.nextInt();
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+thang+" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+thang+" có 30 ngày");
                break;
            case 2:
                System.out.println("Mời nhập năm: ");
                double nam = sc.nextDouble();
                if (((nam %4 ==0) && (nam %100 !=0)) || ( nam %400 ==0))
                    System.out.println("Tháng 2 có 29 ngày");
                else
                    System.out.println("Tháng 2 có 28 ngày");
                break;
            default:
                System.out.println("Một năm chỉ có 12 tháng");
        }
    }
}
