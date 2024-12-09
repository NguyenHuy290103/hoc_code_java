package video1_77;import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class bai28_AL_vd1 {
    public static void main(String[] args) {
        /*Java 28: Viết chương trình tạo ra 1 list có n phần tử, n nhập từ bàn phím
        Các phần tử là số ngẫu nhiên từ (1,100)
        */
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        Random rd = new Random();
        for (int i=0;i<n; i++){
            int ngaunhien = rd.nextInt(1,101);//--> chạy từ 0 đến sát 101
            lst.add(ngaunhien);
        }
        System.out.println(lst);
    }
}
