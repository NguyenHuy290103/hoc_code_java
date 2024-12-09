package video1_77;import java.util.Random;

public class bai24_random {
    public static void main(String[] args) {
        Random rd = new Random();
        //1. Lấy ngẫu nhiên một số nguyên
        int soNguyen = rd.nextInt(-50,51); //chay thu -50 den <51
        System.out.println(soNguyen);
        //2. Chạy ngẫu nhiên số thực
        double soThuc = rd.nextDouble(-20,21);
        System.out.println(soThuc);
    }
}
