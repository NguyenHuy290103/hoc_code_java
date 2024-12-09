package video1_77;import java.util.Scanner;

public class bai21_vd2 {
    /*Viết chương trình nhập vào từ bàn phím 2 số a, b
    Nhập 1 ký tự +, -, *, /
    Dùng function
    Nếu nhập + : Tính a+b và in ra kết quả
    Nếu nhập - : Tính a-b và in ra kết quả
    Nếu nhập * : Tính a*b và in ra kết quả
    Nếu nhập / : Tính a/b và in ra kết quả (chú ý ktra mẫu số khác 0)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập a");
        double a = sc.nextDouble();
        System.out.println("Mời nhập b");
        double b = sc.nextDouble();
        System.out.println("Mời nhập phép tinh: +, -, *, /");
        Scanner string = new Scanner(System.in);
        String pheptinh = string.nextLine();
        switch (pheptinh){
            case "+":
                cong(a,b);
                break;
            case "-":
                tru(a,b);
                break;
            case "*":
                nhan(a,b);
                break;
            case "/":
                chia(a,b);
                break;
            default:
                System.out.println("Phép tính không hợp lệ");
        }
    }
    public static void  cong(double a, double b){
        double kq = a+b;
        System.out.println(kq);
    }
    public static void  tru(double a, double b){
        double kq = a-b;
        System.out.println(kq);
    }
    public static void  nhan(double a, double b){
        double kq = a*b;
        System.out.println(kq);
    }
    public static void  chia(double a, double b){
        if (b==0)
            System.out.println("Mẫu không thể bằng 0");
        else{
            double kq = a/b;
            System.out.println(kq);
        }
    }
}
