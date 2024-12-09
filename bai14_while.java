package video1_77;import java.util.Scanner;

public class bai14_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập x: ");
        int x = sc.nextInt();
        while (x <= 5){
            System.out.println("x= "+x);
            x++;
        }
    }
}
