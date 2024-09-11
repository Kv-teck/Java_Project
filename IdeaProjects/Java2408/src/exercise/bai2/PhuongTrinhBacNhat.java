package exercise.bai2;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
//        ax+b = 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào b:");
        int b = sc.nextInt();

        if (a== 0 && b == 0)
            System.out.println("Phương trình có vô số nghiệm");
        else if(a == 0 && b != 0)
            System.out.println("Phương trình vô nghiệm");
    }
}
