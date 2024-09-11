package exercise.bai3;

public class BaiTap_6 {
    //    Cần có tổng 200.000đ từ 3 loại giấy bạc 1000đ, 2000đ, và 5000đ. Lập
//    chương tình để tìm tất cả các phương án có thể.
    public static void main(String[] args) {
        int count = 0;
        int totalAmount = 200000;

        // Duyệt qua số lượng tờ 5000đ có thể
        for (int i = 0; i <= totalAmount / 5000; i++) {
            // Duyệt qua số lượng tờ 2000đ có thể
            for (int j = 0; j <= (totalAmount - i * 5000) / 2000; j++) {
                // Số tiền còn lại phải dùng tờ 1000đ
                int remainingAmount = totalAmount - (i * 5000 + j * 2000);

                // Tính số lượng tờ 1000đ cần thiết
                int k = remainingAmount / 1000;

                System.out.println("Phương án " + (++count) + ": " +
                        i + " tờ 5000đ, " + j + " tờ 2000đ, " + k + " tờ 1000đ");
            }
        }

        System.out.println("Tổng số phương án: " + count);
    }
}
