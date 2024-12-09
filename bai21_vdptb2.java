package video1_77;import java.util.Scanner;

public class bai21_vdptb2 {
    public static void main(String[] args) {
        /* Viết chương trình giải ptb2 dùng hàm :
              Tìm nghiệm của ptb2 với : a = 1, b = 2, c = 3
              Tìm nghiệm của ptb2 với : a = 1, b = 2, c = 1
              Tìm nghiệm của ptb2 với : a = 1, b = 2, c = -3 */
        String kq = Gaiptb2(1,2,3);
        String kq1 = Gaiptb2(1,2,1);
        String kq2 = Gaiptb2(1,2,-3);
        String kq3 = Gaiptb2(0,2,-3);
        System.out.println(kq);
        System.out.println(kq1);
        System.out.println(kq2);
        System.out.println(kq3);

        //nhap vao tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap a");
        double a = sc.nextDouble();
        System.out.println("Moi nhap b");
        double b = sc.nextDouble();
        System.out.println("Moi nhap c");
        double c = sc.nextDouble();
        String kq4 = Gaiptb2(a,b,c);
        System.out.println(kq4);

    }
    public static String Gaiptb2(double a,double b,double c){
        //nếu a =0 -> pt bac nhat bx+c=0
        if(a==0){
            if (b==0&&c==0)
                return "Phuong trinh bac nhat co vo so nghiem";
            else if (b==0&&c!=0)
                return "Phuong trinh bac nhat co vo  nghiem";
            else
                return "phuong trinh bac nhat co nghiem: "+(-c/b);
        }
        else{
            //giai pt bac 2
            double delta = (b*b)-(4*a*c);
            if (delta<0)
                return "Phuong trinh bac 2 vo nghiem";
            else if (delta==0){
                double x=-b/(2*a);
                return "phuong trinh bac 2 co nghiem kep = "+x;
            }
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                return "phuong trinh bac 2 co hai nghiem x1= "+x1+", x2= "+x2;
            }
        }
    }
}
