package video1_77;public class bai27_mang {
    public static void main(String[] args) {
        //khai báo mảng
        int[] mangint;
        String[] mangtr;
        boolean[] mangbl;

        //khai báo mảng kèm kích thước
        String[] mang1 = new String[3];
        int[] mgn2 = new int[5];

        //khai báo mảng gắn giá trị luôn cho mảng
        String[] mang3 = new String[]{"anh", "huy", "dep","trai"};
        int[] mang4 =  new int[]{1,3,4,5,46,351,63};

        //Truy xuất phần tử của mảng
        for (int i=0;i<mang3.length;i++){
            System.out.println("Phần tử ở vị trí "+i+" của mảng và giá trị của phần tử là: "+mang3[i]);
        }
        //-------------------------------------------------
        for(String pt: mang3){
            System.out.println(pt);
        }

        //gán giá trị cho phần tử
        mang3[0] = "dhfkjsdhf";
        for (int i=0;i<mang3.length;i++){
            System.out.println("Phần tử ở vị trí "+i+" của mảng và giá trị của phần tử là: "+mang3[i]);
        }


        //------------------------------------------------------------------
        int[] mang6 = new int[]{1,2,3,4,5,6,7,8};
        for (int i=0;i<mang6.length;i++){
            mang6[i]+=100;
        }
        for (int i=0;i<mang6.length;i++){
            System.out.println("Phần tử ở vị trí "+i+" của mảng và giá trị của phần tử là: "+mang6[i]);
        }
    }
}
