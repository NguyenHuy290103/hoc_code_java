package video1_77;
import java.util.Scanner;

public class bai11_1
{
    public static void main(String[] args) {
        //tìm x,y khi biết tổng và hiệu

/*
        int x;
        int y;
        //bai tap
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tổng 2 số");
        double tong = sc.nextDouble();
        System.out.println("Nhập vào hiệu hai số");
        double hieu = sc.nextDouble();

        if(tong >=0){
            System.out.println("Giá trị x cần tìm là: "+ ((double)(tong+hieu)/2));
            System.out.println("Giá trị y cần tìm là: "+ (tong-(tong+hieu)/2));
        }
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tổng hai số");
        float tong = sc.nextFloat();
        System.out.println("Nhập vào hiệu hai số");
        float hieu = sc.nextFloat();

        float x = (tong + hieu)/2 ;
        float y = tong - x;

        System.out.println("Giá trị x cần tìm là: "+ x);
        System.out.println("Giá trị y cần tìm là: "+ y);

    }
}
