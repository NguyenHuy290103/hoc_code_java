package video1_77;import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_datetime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);
        // cai ngay thang nam theo y muon
        cal.set(Calendar.YEAR,2003);
        cal.set(Calendar.MONTH,0); //Tháng chỉ chạy từ 0 đến 11
        cal.set(Calendar.DAY_OF_MONTH,29);
        //kiem tra ngay thang sau khi thay doi
        int namsinh = cal.get(Calendar.YEAR);
        int thangsinh = cal.get(Calendar.MONTH);
        int ngaysinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(namsinh+"/"+(thangsinh+1)+"/"+ngaysinh);
        //xuat ngay thang theo định dạng
        SimpleDateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //Tạo đối tượng date để get time trong đối tượng cal
        Date d = cal.getTime();
        String s = dinhdang.format(d);
        System.out.println(s );
    }
}
