package video1_77;import java.sql.SQLData;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai27_mang_vd2 {
    public static void main(String[] args) {
        /*Bài tập java 27
        1. Viết chương trình tạo 1 mảng 1 chiều gồm các phần tử là số nguyên,
        có n phần tử ngẫu nhiên, n do người dùng nhập từ bàn phím
        2. Xuất các giá trị trong mảng
        3. Đảo ngược mảng, và xuất mảng sau khi đảo ngược
        4. Sắp xếp mảng tăng dần
        5. Tính tổng các phần tử trong mảng
        6. Cho người dùng nhập 1 số bất kỳ, kiểm tra số đó có tồn tại trong mảng hay không,
        nếu có xuất ra vị trí index của số đó trong mảng*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rd = new Random();
        int[] mang = new int[n];
        for (int i=0; i<n; i++){
            int ngaunhien = rd.nextInt(9);//--> random chạy từ 0 đến 9-1
            mang[i] = ngaunhien;
        }
        System.out.println(Arrays.toString(mang));
        //đảo ngược mảng
        for (int i=0, j= mang.length-1 ;i<j;i++,j-- ){
            //Khai báo biến tạm
            int luu = mang[i];
            mang[i] = mang[j];
            mang[j] = luu;
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        System.out.println(Arrays.toString(mang));
        //Sắp xếp mảng tăng dần
        Arrays.sort(mang);
        System.out.println("Sắp xếp mảng tăng dần: ");
        System.out.println(Arrays.toString(mang));
        //Tính tổng các phần tử trong mảng
        //int[] a = {1,3,4,5};
        int tong = 0;
        int tong2 = 0;
        for (int i=0; i< mang.length; i++){
            tong+= mang[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: "+tong);
        for (int pt: mang){
            tong2+= pt;
        }
        System.out.println("Tổng các phần tử trong mảng là: "+tong2);
        //-----------------------------------------------------------------------------------
        /*6. Cho người dùng nhập 1 số bất kỳ, kiểm tra số đó có tồn tại trong mảng hay không,
        nếu có xuất ra vị trí index của số đó trong mảng*/
        System.out.println("Mời nhập số: ");
        int so = sc.nextInt();
        boolean kiemtra = false;
        String vitri = " ";
        for (int i=0; i< mang.length;i++){
            if (so == mang[i]) {
                kiemtra = true;
                vitri += (i+" ");//cộng chuỗi
            }
        }
        if (kiemtra){
            System.out.println(so + " có tồn tại trong mảng ở vị trí " + vitri + " của mảng");
        }
        else
            System.out.println(so + " Không tồn tại trong mảng");
    }
}
