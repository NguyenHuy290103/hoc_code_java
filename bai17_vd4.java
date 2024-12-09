package video1_77;public class bai17_vd4 {
    public static void main(String[] args) {
/*      Bài tập Java 15:
        Viết chương trình:
        Tìm những số chia hết cho 3 từ 10 đến 50*/
        System.out.println("Những số chia hết cho 3 từ 10 đến 50 là: ");
        for (int a= 10; a<=50; a++){
            if (a%3 != 0)
                continue;
            else{
                System.out.print(a+", ");
            }
        }
    }
}
