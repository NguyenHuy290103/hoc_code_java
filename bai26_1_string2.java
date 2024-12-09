package video1_77;import java.util.Scanner;

public class bai26_1_string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        //length lấy độ dài chuỗi
        System.out.println(a.length());
        int dodai = a.length();
        //charAt(vi tri)-> lấy ra một ký tu tai vi tri
        for (int i=0; i< dodai; i++){
            System.out.println("vị trí "+i+" là: "+a.charAt(i));
        }
        // hàm getChars (vị trí bắt đầu, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng)
        char[] arrayChar = new char [100];
        a.getChars(2,4,arrayChar,0);
        for (int i =0; i<arrayChar.length;i++){
            System.out.println("Giá trị của mảng tại "+i+" là: "+arrayChar[i]);
        }


        /*int dodai = a.length()+b.length();
        for (int i=0; i< dodai; i++){
            if ()


            if (a.charAt(i)==' ')
                System.out.print(" ");
            else
                System.out.print(a.charAt(i));
            if (b.charAt(i)==' ')
                System.out.print("");
            else
                System.out.print(b.charAt(i));
            System.out.print("");
        }*/
/*        String a ="abcd     ";
        String b ="abc";*/
        /*StringBuilder chuoi = new StringBuilder();
        int i =0 ;
        while ( i < a.length()){
            if (i < b.length()) {
                chuoi.append(a.charAt(i));
                chuoi.append(b.charAt(i));
            }
            else
                chuoi.append(a.charAt(i));
            i++;
        }
        System.out.println("chuoi: "+chuoi);*/
    }
}
