package video1_77;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
/*        //khởi tạo một đối tượng scanner
        Scanner sc= new Scanner(System.in);

        //cho phep nhap chuoi
        System.out.println("moi nhap vao chuong chinh");
        String txt = sc.nextLine();
        System.out.println("text ="+txt);

        //nhap so nguyen
        System.out.println("nhap so nguyen");
        int a = sc.nextInt();
        System.out.println("text =" +a);

        //nhap so thuc
        System.out.println("nhap so thuwc:");
        float b = sc.nextFloat();
        System.out.println("txt ="+b);*/
        System.out.println("moi nhap chuoi");
        String a = new Scanner(System.in).nextLine();
        System.out.println("a =" +a);

        System.out.println("nhap kieu so nguyen");
        int b = new Scanner(System.in).nextInt();
        System.out.println("b =" +b);

        System.out.println("kieu so thuc");
        float c = new Scanner(System.in).nextFloat();
        System.out.println("c = " +c);

        System.out.println("moi nhap chuoi");
        String d = new Scanner(System.in).nextLine();
        System.out.println("d =" +d);
    }
}
