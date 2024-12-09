package video1_77;import java.util.Scanner;

public class bai17_vd7_1 {
    /*Bài 18
    * Viết chương trình nhập nhập số nguyên a>0 từ bàn phím
     Cho biết đó có phải số nguyên tố
     ( số nguyên tố là số >1, và chỉ chia hết cho 1 và chính nó )
        Kết thúc chương trình hỏi người dùng: Bạn có muốn tiếp tục sử dụng phần mềm không?
         Nếu chọn không thì thoát chương trình*/
    public static void main(String[] args) {
        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap a");
        int a = sc.nextInt();
        while(a<=0){
            System.out.println("a phai lon hon 0, vui long nhap laij");
            a = sc.nextInt();
        }
        if (a > 1 && (a%1==0) &&(a%a==0)){
            System.out.println(a + "Là số nguyên tố");
        }
        else
            System.out.println(a+ "khoong phair laf số nguyên tố");
        System.out.println("Bạn có muốn thót không, bấm y để thoát");
        String traloi = new Scanner(System.in).nextLine();
        if (traloi.equals("y") || traloi.equals("Y"))
            break;
    }
    }
}
