package video1_77;public class bai20_xulingoaile {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try{
            int c=a/b;
            System.out.println("c= "+c);
        }catch (Exception ex){
            System.out.println("có lỗi");
            ex.printStackTrace();
        }
        finally {
            System.out.println("có lỗi hya không lỗi đều thực hiện");
        }
        System.out.println("Đoạn code phía sau");
    }
}
