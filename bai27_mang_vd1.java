package video1_77;import java.util.Arrays;
import java.util.Scanner;

public class bai27_mang_vd1 {
    public static void main(String[] args) {
        //viết chương trình tạo mảng một chiều gồm các phần tử là số nguyên
        // có n phần tử, n do người dùng nhập vào mảng
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số phần tử tối đa của mảng: ");
        int n = sc.nextInt();
        //tạo mảng có n phần tử (cấp phát bộ nhớ cho mảng)
        int[] mang = new int[n];
        //Nhập dữ liệu cho từng phần tử của mảng
        System.out.println("Số phần tử của mảng "+mang.length);
        for (int i=0; i<n;i++){
            System.out.println("mang["+i+"]");
            mang[i]= sc.nextInt();
        }
        System.out.println("Mảng được khởi tạo là: ");
        System.out.println(Arrays.toString(mang));
        //---------------------------------------------------
        //sắp xếp tăng dần
        int [] mang1={8,435,54,345,3,5,5,5,1,3,54};
        Arrays.sort(mang1);
        System.out.println("Mảng sau khi sắp xếp là: ");
        System.out.println(Arrays.toString(mang1));
        //---------------------------------------------------
        //Đảo ngược mảng
        int[] mang2 = {6,5,4,77,3,2,1};
        System.out.println(Arrays.toString(mang2));
        for (int i=0, j = mang2.length -1;i<j; i++,j--){
            int luu = mang2[i];
            mang2[i]= mang2[j];
            mang2[j]= luu;
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        System.out.println(Arrays.toString(mang2));

        //-------------------------------------------------------
        //Gắn mảng truy xuất cùng vùng nhớ
        int[] mang5 = {6,5,4,77,3,2,1};
        int[] mang6 =mang5;
        mang5[0]= 10010;
        System.out.println(mang5[0]);
        System.out.println(mang6[0]);

        //clone
        int[] mang7 = {6,5,4,77,3,2,1};
        int[] mang8 =mang7.clone();
        mang7[0]= 10010;
        System.out.println(mang7[0]);
        System.out.println(mang8[0]);
    }
}
