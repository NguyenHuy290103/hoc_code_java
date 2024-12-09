package video1_77;import java.util.Scanner;

public class bai26_vdgiaibai24 {
    public static void main(String[] args) {
        /*Java 24:
        Viết chương trình trích lọc string từ đường dẫn D:/galailaptrinh/music/remix.mp3
        1, tách tên tệp bao gồm cả đuôi : remix.mp3
        2, tách tên file : remix*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào đường dẫn: ");
        //C:/Users/dream/Documents/Zalo Received Files/anhhuydeptrai.com
        String a = sc.nextLine();
        //kiểm tra xem vị trí cuối cùng của dấu / là bao nhiêu
        int lastSlashIndex = a.lastIndexOf('/');
        System.out.println(lastSlashIndex);
        //cắt lấy chuỗi cuối của đường dẫn
        String fileName = a.substring(lastSlashIndex+1);
        System.out.println(fileName);

        //tách tên file : abcd
        int dot = fileName.lastIndexOf('.');
        String nameOnly = fileName.substring(0,dot);
        System.out.println(nameOnly);
    }
}
