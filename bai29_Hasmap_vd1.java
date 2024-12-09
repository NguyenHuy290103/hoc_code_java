package video1_77;import java.util.HashMap;
import java.util.Scanner;

public class bai29_Hasmap_vd1 {
    public static void main(String[] args) {
        /*Java 33:
        Viết chương trình sử dụng dict chứa 10 user name và password.
        Chương trình yêu cầu nhập vào username và pass,
            1. nếu user name o có trong dict, chương trình báo user name o tồn tại
            2. nếu user name đúng mà password sai thì báo : PASSWORD SAI
            3. nếu user, pass đúng thì báo bạn đã login thành công*/
        HashMap<String, String> users  = new HashMap<>();
        users.put("user1", "pass1");
        users.put("user2", "pass2");
        users.put("user3", "pass3");
        users.put("user4", "pass4");
        users.put("user5", "pass5");
        users.put("user6", "pass6");
        users.put("user7", "pass7");
        users.put("user8", "pass8");
        users.put("user9", "pass9");
        users.put("user10", "pass10");
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap tk");
        String tk =  sc.nextLine();
        System.out.println("Moi nhap mk");
        String mk =  sc.nextLine();
        for (String key: users.keySet()){
            String vlue = users.get(key);
            if (tk.equals(key)&& mk.equals(vlue)){
                System.out.println("Đăng nhập thành công");
                break;
            }
            else if (tk.equals(key)&& mk != vlue){
                System.out.println("Bạn nhập sai mật khẩu");
                break;
            }
            else if (tk != key  && mk.equals(vlue)) {
                System.out.println("Bạn nhập sai tài khoản");
                break;
            }
            else
                System.out.println("Bạn nhập sai tài khoản, mật khẩu");
            break;
        }
    }
}
