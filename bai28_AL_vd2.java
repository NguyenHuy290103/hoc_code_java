package video1_77;import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.Scanner;

public class bai28_AL_vd2 {
    public static void main(String[] args) {
        /*Java 29: Viết chương trình nhập vào 1 danh sách list có n phần tử, n do người dùng
        nhập, sau đó:
        #1. tạo ra 1 list mới bình phương các phần tử
        #2. Xác định bao nhiêu phần tử lớn hơn 50*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số phần tử");
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i< n ; i++){
            System.out.println("Mời nhập phần tử thứ "+(i+1));
            int sonhap = sc.nextInt();
            lst.add(sonhap);
        }
        ArrayList<Double> lst2 = new ArrayList<>();
        for (int i = 0; i< n ; i++){
            int vl = lst.get(i);
            lst2.add(Math.pow(vl,2));
        }
        System.out.println(lst);
        System.out.println(lst2);
        /*//Xác định bao nhiêu phần tử lớn hơn 50
        int dem=0;
        for (int vl : lst){
            if (vl>50){
                dem++;
            }
        }
        if (dem>0){
            System.out.println("có "+dem+" phần tử lớn hơn 50");
        }
        else
            System.out.println("Không có phần tử nào lớn hơn 50");*/
        //Xác định bao nhiêu phần tử lớn hơn 50 và nó là phần tử nào
        int dem=0;
        String vitri="";
        for (int i = 0; i<n; i++){
            int vl = lst.get(i);
            if (vl>50){
                dem++;
                vitri+= i+" ";
            }
        }
        if (dem>0){
            System.out.println("có "+dem+" phần tử lớn hơn 50");
            System.out.println("đó là phần tử ở vị trí index: "+vitri);
            System.out.println(lst.get(1));
        }
        else
            System.out.println("Không có phần tử nào lớn hơn 50");
    }
}
