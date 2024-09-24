package exercise.bai4;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 12 chữ số đầu của ISBN-13: ");
        String isbn12 = scanner.nextLine();


        if (isbn12.length() != 12) {
            System.out.println("Chuỗi phải có đúng 12 ký tự.");
        } else {

            boolean isValid = true;
            for (int i = 0; i < isbn12.length(); i++) {
                char ch = isbn12.charAt(i);

                if (!Character.isDigit(ch)) {
                    isValid = false;
                    break;
                }
            }


            if (isValid) {
                System.out.println("Chuỗi hợp lệ: " + isbn12);

            } else {
                System.out.println("Chuỗi chứa ký tự không phải là số.");
            }
        }

        scanner.close();
    }
}
