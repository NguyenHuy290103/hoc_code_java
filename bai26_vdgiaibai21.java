package video1_77;import java.util.Scanner;

public class bai26_vdgiaibai21 {
    public static void main(String[] args) {
        /*Java 21: Viết chương trình chuyển tin nhắn sang mật mã theo bảng :
        #a="abcdefghijklmnopqrstuvwxyz"
        #b="zxcvbnmasdfghjklqwertyuiop"/
         */

        Scanner sc = new Scanner(System.in);
        //System.out.println("Mời nhập chuỗi cần được mã hóa");
        String chuoivao = "a$bcdefgh&&";
        System.out.println("Chuỗi cần được mã hóa: "+chuoivao);
        String chuoira = "";
        String kytula = "";
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        for (int i=0; i< chuoivao.length();i++){
            //Lấy vị trí của ký tự nhập vào trong chuỗi a
            char c = chuoivao.charAt(i);
            int index = a.indexOf(c);
            //kiểm tra điều kiện nếu nguời dungf nhập linh tinh index trả về -1
            /*//cộng thêm vào đằng sau chuỗi mã hóa
            if(index==-1){
                chuoira += c;//chuoira = chuoira+c
            }*/
            //tách các ký tự lạ ra khỏi chuỗi
            if (index==-1){
                kytula+=c;
            }
            else {//nếu ký tự nhập vào giống ký tự của chuỗi a thì in ra ký tự
                //của chuỗi b tương ứng(đúng vị trí)
                chuoira+=b.charAt(index);
            }
        }
        System.out.println("Chuỗi đã được mã hóa: "+chuoira);
        System.out.println("Chuỗi ký tự lạ không thể mã hóa: "+kytula);
    }
}
