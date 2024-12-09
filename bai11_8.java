package video1_77;
import java.util.Scanner;

public class bai11_8 {
    public static void main(String[] args) {
        /*Bài tập Java 09: Viết chương trình nhập vào tháng trong năm, cho biết tháng đó thuộc quý mấy
        Gợi ý:
        1 năm có 4 quý, mỗi quý 3 tháng :

        Quý 1 : tháng 1,2,3
        Quý 2 : tháng 4,5,6
        Quý 3 : tháng 7,8,9
        Quý 4 : tháng 10,11,12*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng trong năm: ");
        int thang = sc.nextInt();
        if (thang == 1 || thang == 2 || thang == 3){
            System.out.println("Tháng "+thang+" thuộc quý 1");
        }
        else if (thang == 4 || thang == 5 || thang == 6){
            System.out.println("Tháng "+thang+" thuộc quý 2");
        }
        else if (thang == 7 || thang == 8 || thang == 9){
            System.out.println("Tháng "+thang+" thuộc quý 3");
        }
        else if (thang == 10 || thang == 11 || thang == 12){
            System.out.println("Tháng "+thang+" thuộc quý 4");
        }
        else{
            System.out.println("Một năm chỉ có 12 tháng");
        }
    }
}
