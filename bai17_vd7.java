package video1_77;import java.util.Scanner;

public class bai17_vd7 {
    /*Bài 18
    * Viết chương trình nhập nhập số nguyên a>0 từ bàn phím
     Cho biết đó có phải số nguyên tố
     ( số nguyên tố là số >1, và chỉ chia hết cho 1 và chính nó )
        Kết thúc chương trình hỏi người dùng: Bạn có muốn tiếp tục sử dụng phần mềm không?
         Nếu chọn không thì thoát chương trình*/
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập a: ");
        int a = sc.nextInt();
        if (a>1 && (a%1==0) &&(a%a==0)){
                System.out.println(a+" là số nguyên tố");
        }
        else
            System.out.println(a+" không phải là số nguyên tố");
        System.out.println("Bạn có muốn thoát chương trình");
        System.out.println("1. Có");
        System.out.println("2. Không");
        int thoat = sc.nextInt();
        switch (thoat){
            case 1:

            case 2:
                break;
        }*/


        //Kiểm tra a có phải là số nguyên tố hay không
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời nhập a: ");
            int a = sc.nextInt();
            while (a<=0){
                System.out.println("a phải lớn hơn 0, vui lòng nhập lại");
                a = sc.nextInt();
            }
            System.out.println("Nhập thành công a = "+a);
            int dem = 0;
            for (int i =1; i<=a; i++){
                if(a%i == 0){
                    dem++;
                }
            }
            if (dem == 2){
                System.out.println(a+" là số nguyên tố");
            }
            else
                System.out.println(a+" không phải là số nguyên tố");
            System.out.println("Bạn có muốn thót không, bấm y để thoát");
            String traloi = new Scanner(System.in).nextLine();
            if (traloi.equals("y") || traloi.equals("Y"))
                break;
        }
    }
}
