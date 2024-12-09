package video1_77;import java.util.Calendar;
import java.util.Scanner;

public class bai22_vd1 {
    public static void main(String[] args) {
        //Viết chương trình cho phép người dùng nhập vào ngày tháng năm sinh.
        //cho biết số tuổi và in ra màn hình
        int day, month, year, tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào ngày sinh: ");
        day = sc.nextInt();
        System.out.println("Mời nhập vào tháng sinh: ");
        month = sc.nextInt();
        System.out.println("Mời nhập vào năm sinh: ");
        year = sc.nextInt();
        //khoi tao ngay thangs
        Calendar cal = Calendar.getInstance();
        //xet ngay thangs sinh do nguoiw dungf nhap vaof
        cal.set(year,month-1,day);
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng năm sinh: "+
                namSinh+"/"+
                (thangSinh+1)+"/"+
                ngaySinh);
        //tinh tuoi
        //Cần lấy được năm hiện tại
        Calendar now = Calendar.getInstance();
        int namhientai = now.get(Calendar.YEAR);
        tuoi = namhientai - namSinh;
        System.out.println("Tuổi của bạn là: "+tuoi);
    }
}
