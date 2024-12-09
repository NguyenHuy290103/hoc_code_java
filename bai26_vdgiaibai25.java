package video1_77;import java.util.Scanner;

public class bai26_vdgiaibai25 {
    public static void main(String[] args) {
        /*Java 25:
        Viết chương trình kiểm tra 1 chuỗi nhập vào từ bàn phím có phải Panlyndrome
                (là chuỗi có đảo ngược cũng bằng chính nó, ví dụ madam, radar ...)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String chuoi1 = sc.nextLine();

        /*//khai báo chuỗi string builder
        StringBuilder a = new StringBuilder(chuoi1);
        a.reverse(); //đảo ngược lại chuỗi
        String chuoi2 = a.toString(); //chuyển sang chuỗi*/

        String chuoi2 = new StringBuilder(chuoi1).reverse().toString();

        /*int dem= 0;
        for (int i =0; i< chuoi1.length(); i++){
            char c = chuoi1.charAt(i);
            char d = chuoi2.charAt(i);
            if(c==d){
                dem++;
            }
        }
        if (dem == chuoi1.length()){
            System.out.println("Chuỗi bạn nhập vào có phải Panlyndrome");
        }
        else
            System.out.println("Chuỗi bạn nhập vào không phải Panlyndrome");*/
        if (chuoi1.equalsIgnoreCase(chuoi2)){
            System.out.println("Chuỗi bạn nhập vào có phải Panlyndrome");
        }
        else
            System.out.println("Chuỗi bạn nhập vào không phải Panlyndrome");
    }
}
