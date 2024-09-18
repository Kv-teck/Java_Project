import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bai_1();
    }

    static void bai_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 1; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    static void bai_2() {
        int n = 8;

    }
}