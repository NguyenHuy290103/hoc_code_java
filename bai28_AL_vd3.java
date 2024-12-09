package video1_77;import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai28_AL_vd3 {
    public static void main(String[] args) {
        /*Kotlin 30: Viết chương trình trả lời kết quả các phép tính
        quest = {"2 + 5 + 7 =", "5 * 10 =", "sqrt(16) =", "12%2 ="}*/
        Scanner sc = new Scanner(System.in);
        ArrayList<String> quest = new ArrayList<>(List.of("2 + 5 + 7 =", "5 * 10 =", "sqrt(16) =", "12%2 ="));
        //_________________________________________________________________________________
        //C1:
/*        ArrayList<String> kq = new ArrayList<>(List.of("14","50","4","0"));
        for (int i=0; i<quest.size();i++){
            System.out.println(quest.get(i));
            String nhap = sc.nextLine();
            if (nhap.equals(kq.get(i))){
                System.out.println("dung");
            }
            else {
                System.out.println("sai");
                System.out.println("Kết quả là: "+kq.get(i));
            }
        }*/
        //_________________________________________________________________________________
        //C2:
        ArrayList<Float> kq = new ArrayList<>(List.of(14f,50f,4f,0f));
        //Nhập theo Float phải thêm f đằng sau mỗi phần tử
        for (int i=0; i<quest.size();i++){
            System.out.println(quest.get(i));
            Float nhap = sc.nextFloat();
            if (nhap.equals(kq.get(i))){
                System.out.println("dung");
            }
            else {
                System.out.println("sai");
                System.out.println("Kết quả là: "+kq.get(i));
            }
        }
    }
}
