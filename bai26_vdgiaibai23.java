package video1_77;import java.util.Scanner;

public class bai26_vdgiaibai23 {
    public static void main(String[] args) {
        /*Java 23: Viết chương trình tách số và chữ từ chuỗi nhập vào thành 2 chuỗi:
                ví dụ nhập vào: abc123 sẽ tách và in ra thành 2 chuỗi abc và 123*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String chuoi = sc.nextLine();
        StringBuilder chu = new StringBuilder();
        StringBuilder so = new StringBuilder();
        String kytukhac = "";
        for (int i = 0; i<chuoi.length();i++){
            char c = chuoi.charAt(i);
            if (Character.isDigit(c)){
                //so+=c; //chu= chu+c
                so.append(c);//thêm vào cuối chuỗi
            }
            else if (Character.isLetter(c)){
                chu.append(c);
            }
            else
                kytukhac+=c;
        }
        System.out.println("Chuỗi chứa ký tự số: "+so);
        System.out.println("Chuỗi chứa ký tự chữ: "+chu);
        System.out.println("Chuỗi chứa ký tự khác: "+kytukhac);
    }
}
