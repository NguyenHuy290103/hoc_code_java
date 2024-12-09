package video1_77;import java.util.concurrent.atomic.AtomicInteger;

public class bai26_vdgiaibai22 {
    /*Java 22: String a = "tôi chăm học tôi chịu khó tôi đẹp zai";
    Đếm từ tôi trong string a trên ?*/
    public static void main(String[] args) {
        String a = "tôi chăm học tôi chịu khó tôi đẹp zai";
        String[] mang = a.split(" ");
        String b = "tôi";
        int dem = 0;
        //Cách 1
        /*int dem1 = 0;
        try {
            for (int i=0; i< a.length();i++){
                if (b.compareTo(mang[i])==0){
                    dem++;
                }
                else
                    dem1++;

            }
        }catch (Exception exception){

        }

        System.out.println(dem);*/
        //Cách 2
        //Duyệt từng từ trong mảng
        for (String tu: mang){
            if(tu.equals("tôi"))
                dem++;
        }
        System.out.println(dem);
    }
}
