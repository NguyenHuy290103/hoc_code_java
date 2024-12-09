package video1_77;import java.util.Scanner;

public class bai26_vdgiaibai20 {
    public static void main(String[] args) {
        /*Java 20: Viết chương trình kiểm tra tính hợp lệ của mật khẩu: aaaaaAAAAAA1
        - mật khẩu hợp lệ khi có ít nhất 6 ký tự
        - chứa ít nhất 1 chữ cái ( chữ cái thường hoặc hoa đều được)
        - chứa ít nhất 1 chữ số
        1. cho người dùng nhập vào mật khẩu để login / so sánh,
            nếu đúng mở cửa, sai quá 5 lần khóa đăng nhập, thoát chương trình*/
        //---------------------------------------------------------------------------------
        /*Scanner sc = new Scanner(System.in);
        System.out.printf("Mời nhập mật khẩu: ");
        String a = sc.nextLine();
        int demso = 0;
        int demchuthuong = 0;
        int demchuhoa = 0;
        int kytukhac = 0;
        int i = a.length();
        while (i<6) {
            System.out.printf("Mời nhập lại: ");
            a = sc.nextLine();
            if (a.length()>=6)
                break;
        }
        for (int x=0;x<i;x++){
            char c = a.charAt(x);
            if (Character.isDigit(c)){
                demso++;
            } else if (Character.isLowerCase(c)) {
                demchuthuong++;
            } else if (Character.isUpperCase(c)) {
                demchuhoa++;
            }else
                kytukhac++;
        }
        int c = 0;
        while (c<i) {
            if (demso > 1 && (demchuthuong > 1 || demchuhoa > 1))
                System.out.printf(a);
            else {
                System.out.printf("Mời nhập lại: ");
                a = sc.nextLine();
            }
        }*/



        //------------------------------------------------------------------------------
        /*boolean kq = checmk("123456a");
        if (kq)
            System.out.printf("Mật khẩu hợp lệ");
        else
            System.out.printf("Mật khẩu không hợp lệ");*/
        //------------------------------------------------------------------------------
        //cho người dùng nhập vào mật khẩu để login / so sánh
        Scanner sc = new Scanner(System.in);
        String password= "";
        while (true){
            System.out.println("Mời nhập thiết lập mật khẩu: ");
            System.out.println("Mật khẩu cần có ít nhất một kí tự sô, một ký tự chữ hin hoa hoặc in thường: ");
            String a = sc.nextLine();
            if(checmk(a)){
                password = a ;
                System.out.println("Mật khẩu mới đã được thiết lập");
                break;
            }
            else
                System.out.println("Mời nhập lại mật khẩu");
        }
        //------------------------------------------------------------------------------
        //sai quá 5 lần khóa đăng nhập, thoát chương trình
        int dem = 0;
        int max = 5;
        String login ="";
        while (true){
            System.out.println("Mời nhập login: ");
            login = sc.nextLine();
            //equals so sánh chuỗi
            if (login.equals(password)){
                System.out.println("Đăng nhập thành công");
                break;
            }
            else{
                System.out.println("Mk không đúng vui lòng nhập lại, bạn còn "+(max-1-dem)+" lần thử");
                dem++;
            }
            if (dem==max){
                System.out.println("Bạn đã nhập sai 5 lần, đăng nhập bị khóa");
                break;
            }
        }
    }
    //boolean nhận giá trị true false
    public static boolean checmk(String password){
        //kiểm tra độ dài
        if(password.length()<6)
            return false;

        //kiểm tra xem có chứa ít nhất một chữ cái hay không
        boolean hasLetter = false;
        //toCharArray() Trả về từng ký tự của chuỗi
        for (char c : password.toCharArray()){
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }

        }
        //nếu không có chữ cái nào trả về false
        if (!hasLetter)//phủ định của true = false -> !
            return false;

        //kiểm tra xem có chứa ít nhất một chữ số hay không
        boolean hasNumber = false;
        //toCharArray() Trả về từng ký tự của chuỗi
        for (char c : password.toCharArray()){
            if (Character.isDigit(c)){
                hasNumber = true;
                break;
            }
        }
        //nếu không có chữ số nào trả về false
        //phủ định của true = false -> !
        if (!hasNumber)//phủ định của true = false -> !
            return false;

        //Các điều kiện trên đều thỏa mãn
        return true;
    }
}
