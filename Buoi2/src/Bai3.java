import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        long gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.printf("Giai thua %d! = " + gt + "%n", n);

        int tongChan = 0;
        for (int i = 0; i<=n; i++) {
            if (i % 2 == 0) {
                tongChan += i;
            }
        }
        System.out.printf("Tong so chan tu 1 den %d = " + tongChan, n);
    }
}
