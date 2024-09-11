package exercise.bai3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
//        Công thức của dãy fibonacci có dạng: f(n) = f(n-1) + f(n-2) .
//                Với f(1) = 1;  f(2) =1;
//        Nhập n từ bàn phím (n dương, bắt nhập lại nếu n âm, chỉ được phép sử dụng vòng for) và in ra màn hình dãy f(n)
        Scanner sc = new Scanner(System.in);
        int n;

        // Nhập n từ bàn phím, yêu cầu nhập lại nếu n <= 0
        do {
            System.out.print("Nhập một số nguyên dương n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số nguyên dương!");
            }
        } while (n <= 0);

        // Khởi tạo hai số đầu tiên của dãy Fibonacci
        int fib1 = 1, fib2 = 1;

        // In dãy Fibonacci
        System.out.print("Dãy Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                System.out.print(1 + " ");
            } else {
                int fib = fib1 + fib2;
                System.out.print(fib + " ");
                fib1 = fib2;
                fib2 = fib;
            }
        }
    }

}
