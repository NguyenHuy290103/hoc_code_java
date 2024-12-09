package video1_77;public class bai26_1_string1 {
    public static void main(String[] args) {
        String s = "Hồi đó em chê mồm tôi rộng"+
                "\nabcdnro";
        System.out.println(s);
        //Khai báo đối tượng st
        StringBuilder chuoi = new StringBuilder();
        //appen: thêm vào cuối chuỗi
        chuoi.append("xin chao, ");
        chuoi.append("minh moi hoc lap trinh ");
        System.out.println(chuoi);
        //7.2. insert(vị trí index, chuỗi cần chèn)
        chuoi.insert(2, "huy");
        System.out.println(chuoi);
        //7.3. delete(start, end):
        //xóa tất cả các ký tự từ vị trí start đến vị trí end
        chuoi.delete(2,5);//xoa tu 2 cho đến 5-1
        System.out.println(chuoi);
        //7.4. chuoi.length: trả về độ dài của chuỗi tính cả space
        System.out.println(chuoi.length());

        //buoi 2
        //indexOf
        //Kiểm tra vị trí xuất hiện đầu tiên, nếu không có trả về -1
        String abc = "toi di tim toi";
        System.out.println(abc.indexOf("toi"));
        //lastIndexOf
        //Kiểm tra vị trí xuất hiện cuối, nếu không có trả về -1
        System.out.println(abc.lastIndexOf("toi"));
        //Contains : kiểm tra chuỗi con
        String abc1 = ".mp3";
        String abc2 = "tuhoc.mp3";
        //kiểm tra abc2 có chứa cụm của abc1 hay không
        boolean check = abc2.contains(abc1);
        if(check)
            System.out.println("Có .mp3 trong chuỗi abc2");
        else
            System.out.println("Khoong cos");
        //7.8 Substring: Trích lọc chuỗi con từ chuỗi ban đầu
        //substring(int beginIndex)
        //substring(int beginIndex, int endIndex)
        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13 = s11.substring(4,7);
        System.out.println(s13);

        //replace("str old","str new") : thay thế toàn bộ chuỗi old thành chuỗi new
        String s14 = "Tôi đi tìm Tôi";
        String s15 = s14.replace("Tôi","abcd");
        System.out.println(s14);
        System.out.println(s15);
        //replaceFirst("str old","str new") : thay thế chuỗi old đầu tiên tìm thấy thành chuỗi new
        String s16 = "Học đi tìm Học";
        String s17 = s16.replaceFirst("Học","abcd");
        System.out.println(s16);
        System.out.println(s17);

        //trim() xóa toàn bộ khoảng trắng ở đầu và cuối
        String s18 = "       abcdrti  jrij    ";
        String s19 = s18.trim();
        System.out.println(s18);
        System.out.println(s19);

        //7.12 trim(): Xóa toàn bộ khoảng trắng ở cuối
        // cách 1: biểu thức chính quy (regular expression)
        // dùng \s+$ để xóa tất cả các khoảng trắng ở cuối chuỗi
        String s20 = s18.replaceAll("\\s+$","");
        System.out.println(s18);
        System.out.println(s18.length());
        System.out.println(s20);
        System.out.println(s20.length());

        // cách2: sử dụng vòng lặp để xóa
        String s21 = "       abcdrti  jrij    ";
        while (s21.endsWith(" ")){
            s21=s21.substring(0,s21.length()-1);
        }
        //7.13 trim(): Xóa toàn bộ khoảng trắng ở đầu
        // cách 1: biểu thức chính quy (regular expression)
        // dùng ^\s+$ để xóa tất cả các khoảng trắng ở đầu
        String s22 = "       abcdrti  jrij    ";
        String s23 = s22.replaceFirst("^\\s+","");
        System.out.println(s22);
        System.out.println(s22.length());
        System.out.println(s23);
        System.out.println(s23.length());
        // cách2: sử dụng vòng lặp để xóa
        String s24 = "       abcdrti  jrij    ";
        while (s24.startsWith(" ")){
            s24=s24.substring(1);
        }
        System.out.println(s24);
    }
}
