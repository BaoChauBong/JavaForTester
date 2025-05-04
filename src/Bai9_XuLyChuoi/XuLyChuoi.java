package Bai9_XuLyChuoi;

public class XuLyChuoi {
    public static void main(String[] args) {

        // LƯU Ý : CHUỖI TÍNH TỪ VỊ TRÍ KÝ TỰ VÀ BẮT ĐẦU TỪ 0

        String str1 = "Diễn viên Tín Nguyễn, 28 tuổi, từng nhận các tin nhắn phản đối gay gắt của khán giả khi cô lần đầu tham gia phim điện ảnh.";
        String str2 = "phim điện ảnh";

        ///  Cắt chuỗi - dùng hàm substring
        System.out.println("Cắt chuỗi dạng thứ nhất : " + str1.substring(9));
        System.out.println("Cắt chuỗi dạng thứ hai : " + str1.substring(9, 34));

        /// Nối chuỗi
        System.out.println("Nối chuỗi : " + str1 + " " + str2);
        System.out.println("Nối chuỗi : " + str1.concat(" " + str2));

        /// Độ dài chuỗi
        System.out.println(str1.length());

        ///  Tách chuỗi
        System.out.println("Tách chuỗi : " + str1.split(",")[0]); // lấy gtr đầu tiên sau khi tách
        System.out.println("Tách chuỗi : " + str1.split(",")[1]); // lấy gtr đầu tiên sau khi tách

        ///  Loại bỏ khoảng trắng 2 đầu
        System.out.println("Tách chuỗi : " + str1.split(",")[1].trim());

        ///  So sansh chuỗi
        String str3 = "Bãi Sau thức giấc lung linh, sáng rực trong đại lễ 30-4";
        String str4 = "Bãi Sau thức giấc lung linh, sáng rực trong đại lễ 30-4 à";
        String str5 = "bãi sau thức giấc lung linh, sáng rực trong đại lễ 30-4";

        System.out.println("So sánh chứa : " + str3.contains("Bãi Sau"));
        System.out.println("So sánh chứa : " + str3.contains("Bãi Đá"));

        System.out.println("So sánh bằng : " + str3.equals(str4));
        System.out.println("So sánh bằng : " + str3.equals("Bãi Sau thức giấc lung linh, sáng rực trong đại lễ 30-4"));
        System.out.println("So sánh bằng : " + str3.equalsIgnoreCase(str5));

        System.out.println("Bắt đầu : " + str3.startsWith("Bãi"));
        System.out.println("Kết thúc : " + str3.endsWith("30-4"));

        String name = "  ";
        System.out.println("Không xem space là chuỗi rỗng : " + name.isEmpty());
        System.out.println("Xem space là chuỗi rỗng : " + name.isBlank());
    }

}
