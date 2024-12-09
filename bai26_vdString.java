package video1_77;import java.util.Scanner;

public class bai26_vdString {
    public static void main(String[] args) {
        /*Nhập vào 1 chuỗi từ bàn phím
            đếm xem có bao nhiêu ký tự thường
                bao nhiêu in hoa
                bao nhiêu số
                bao nhiêu space*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi");
        String chuoi = sc.nextLine();
        System.out.println("Chuỗi bạn vừa nhập: "+chuoi);
        int demso = 0;
        int demchuthuong = 0;
        int demchuhoa = 0;
        int demkhoangtrang = 0;
        int kytukhac =0;
        for(int i= 0 ; i< chuoi.length();i++){
            char c = chuoi.charAt(i);
            if (Character.isDigit(c))
                demso++;
            else if (Character.isLowerCase(c))
                demchuthuong++;
            else if (Character.isUpperCase(c))
                demchuhoa++;
            else if (Character.isWhitespace(c))
                demkhoangtrang++;
            else
                kytukhac++;
        }
        System.out.println("Có "+demso+" số");
        System.out.println("Có "+demchuthuong+" chữ thường");
        System.out.println("Có "+demchuhoa+" chữ hoa");
        System.out.println("Có "+demkhoangtrang+" khoảng trắng");
        System.out.println("Có "+kytukhac+" ký tự khác");
    }
}
