package video1_77;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào bán kính đường tròn r: ");
        double cv = 2 * Math.PI * sc.nextDouble();
        double dt = Math.PI * Math.pow(sc.nextDouble(),2);
        System.out.println("bán kính r =" +sc.nextDouble());
        System.out.println("chu vi =" +cv);
        System.out.println("diện tích =" +dt);
    }
}
