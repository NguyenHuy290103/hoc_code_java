package video1_77;public class bai26_vdString2 {
    public static void main(String[] args) {
        /*Java 19: Cho: String str1= "English = 78 Science = 83 Math = 68 History = 65"
        1. tính tổng các số trong chuỗi trên
        2. tính trung bình cộng

        Java 20: Viết chương trình kiểm tra tính hợp lệ của mật khẩu: aaaaaAAAAAA1
        - mật khẩu hợp lệ khi có ít nhất 6 ký tự
        - chứa ít nhất 1 chữ cái ( chữ cái thường hoặc hoa đều được)
        - chứa ít nhất 1 chữ số
        1. cho người dùng nhập vào mật khẩu để login / so sánh,
        nếu đúng mở cửa, sai quá 5 lần khóa đăng nhập, thoát chương trình*/


        //Tính tổng các số có trong chuỗi
        String a = "English = 78 Science = 83 Math = 68 History = 65";
        int tong = 0;
        for (int i =0; i <a.length();i ++){
            char c = a.charAt(i);
            if (Character.isDigit(c)){
                System.out.println(c);
                //chuyển ký tự từ bảng mã AISS sang string
                String b = Character.toString(c);
                System.out.println(b);
                //chuyển từ string sang int
                int e = Integer.parseInt(b);
                //int e = Integer.valueOf(b);

                tong = tong+e;
            }
        }
        System.out.println(tong);
    }
}
