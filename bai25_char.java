package video1_77;import java.util.Scanner;

public class bai25_char {
    public static void main(String[] args) {
        //Khai báo
        char ch = 'a';//khởi tạo
        char ch2 = 66;//khởi tạo
        char ch3;//khai báo
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Mời nhập vào: ");
        String input = sc.nextLine();
        char ch4 = input.charAt(0);
        System.out.println("Ký tự vừa nhập "+ch4);*/
        // So sánh
        System.out.println(Character.compare('a','a'));
        System.out.println(Character.compare('A','a'));
        System.out.println(Character.compare('a','A'));

        char ch5 = '1';
        char ch6 = 'A';
        char ch7 = 'a';
        char ch8 = ' ';
        //Kiểm tra xem có phải số hay không
        System.out.println(Character.isDigit(ch5));
        //Kiểm tra xem có phải ký tự in hoa hay không
        System.out.println(Character.isUpperCase(ch6));
        //Kiểm tra xem có phải ký tự thường hay không
        System.out.println(Character.isLowerCase(ch7));
        //Kiểm tra xem có phải dấu cách hay không
        System.out.println(Character.isWhitespace(ch8));
    }
}
