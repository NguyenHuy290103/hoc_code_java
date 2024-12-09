package video1_77;public class bai26_vdgiaibai26 {
    public static void main(String[] args) {
        /*Java 26:
        Nhập vào 1 chuỗi => Tối ưu hoá chuỗi ( chuẩn hoá chuỗi) theo quy tắc :
        1, không có khoảng trắng dư thừa
        2, các từ cách nhau bởi 1 khoảng trắng
        3, Ký tự đầu tiên của mỗi từ phải được viết hoa, chữ cái phía sau viết thường

        Ví dụ : input: "    Gà lạI    Lập Trình   "
        Output: "Gà Lai Lập Trình"*/
        String a = "    Gà lạI    Lập Trình   ";
        System.out.println(chuanhoa(a));
    }
    public static String chuanhoa(String a){
        //Xóa toàn bộ khoảng trắng ở đầu và cuối câu
        a=a.trim();
        //tách chuỗi bằng split
        // \s+ một hoặc nhiều khoảng trănngs liên tiếp
        String[] word = a.split("\\s+");
        for (int i=0; i< word.length; i++){
            //chuyển toàn bộ ký tự của phần tử i tại vị trí thứ i thành ký tự thường
            word[i] =word[i].toLowerCase();
            //lấy ký tự đầu tiên của phần tử i
            String firstChar = word[i].substring(0,1);
            //in hoa ký tự vừa lấy được
            firstChar = firstChar.toUpperCase();
            //cộng các ký tự in hoa và ký tự thường lại với nhau
            word[i] = firstChar + word[i].substring(1);
        }
        //Trả về chuỗi, mỗi phần tủ trong chuỗi cách nhau bằng dấu ' '
        return String.join(" ",word);
    }
}
