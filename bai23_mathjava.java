package video1_77;public class bai23_mathjava {
    public static void main(String[] args) {
        System.out.println("Pi = "+ Math.PI);
        //Trị tuyệt đối
        int a = -9;
        System.out.println("Giá trị tuyệt đối của a là: "+Math.abs(a));
        //giá tị lớn nhất và nhỏ nhất trong khoảng x,y
        int x =1;
        int y =20;
        System.out.println("Giá trị lớn nhất là: "+Math.max(x,y));
        System.out.println("Giá trị nhỏ nhất là: "+Math.min(x,y));
        //can bac 2
        double b = 20;
        System.out.println("căn bậc 2 của "+b+" là: "+Math.sqrt(b));
        //luy thua
        System.out.println("Bình phương của "+a+" là: "+Math.pow(a,2));
        //goc
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.cos(Math.PI*goc/180);
        double tan = Math.tan(Math.PI*goc/180);
        System.out.println("Sin của "+goc+" bằng: "+sin);
        System.out.println("cos của "+goc+" bằng: "+cos);
        System.out.println("tan của "+goc+" bằng: "+tan);
    }
}
