package video1_77;import java.util.Locale;

public class bai26_sosanh2chuoi_compareTo {
    public static void main(String[] args) {
        //compareTo, compareToIgnoreCase: so sánh 2 chuỗi
        //Bằng nhau trả về 0
        //lớn hơn trả về > 0
        //nhỏ hơn trả về < 0

        //compareToIgnoreCase: bỏ qua phân biệt chữ hoa chữ thường
        String s1 = "abcd1234";
        String s2 = "abcd1234";

        int x = s1.compareTo(s2);
        //Trả về 0
        System.out.println(x);

        String s3 = "Abcd1234";
        String s4 = "abcd1234";
        /*A có giá trị 65 trong bẳng mã ASII
        a có giá trị 97 trong bẳng mã ASII
                65-97 = -32*/
        int y = s3.compareTo(s4);
        //Trả về -32 <0
        System.out.println(y);
        String s5 = "Abcd1234";
        String s6 = "abcd1234";
        //compareToIgnoreCase: bỏ qua phân biệt chữ hoa chữ thường
        int z = s5.compareToIgnoreCase(s6);
        //Trả về 0
        System.out.println(z);

        //nối cộng chuỗi
        String s7 = "Abcd1234";
        String s8 = s7+" abcd1234";
        System.out.println(s7);
        System.out.println(s8);

        //bài 7.17 split tách chuỗi
        String s9 = "jhasdj, fhjaaf";
        String[] mang = s9.split(", ");
        for (int i =0; i<mang.length;i++){
            System.out.println(mang[i]);
        }

        //bài 7.18 toLowerCase() & toUpperCase()
        String s10 = "Tôi TỰ HỌC lập tRình";
        String s11 = s10.toLowerCase();
        System.out.println(s11);
        String s12 = s10.toUpperCase();
        System.out.println(s12);

        //bài 7.19 toCharArray() tách chuỗi thành từng ký tự, cho vào mảng
        String s13 = "abcdefgh123@";
        char[] mang2 = s13.toCharArray();
        //duyệt mảng
        for (int i =0; i<mang2.length;i++){
            System.out.println(mang2[i]);
        }

        //bai 7.20 reverse() Đảo ngược chuỗi
        String s14 = "abcdefgh123@";
        //khai báo chuỗi string builder
        StringBuilder chuoi = new StringBuilder(s14);
        chuoi.reverse();
        String s15 = chuoi.toString(); //chuyển sang chuỗi
        System.out.println(chuoi);
    }
}
