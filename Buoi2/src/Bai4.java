import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int dao = 0;
        int tg = n;
        while (tg != 0) {
            int du = tg % 10;
            dao = dao * 10 + du;
            tg = tg / 10;
        }
        System.out.println("So nguyen n sau khi dao: " + dao);

        if (dao == n) {
            System.out.printf("So %d la so doi xung!", n);
        }
        else {
            System.out.printf("So %d khong phai la so doi xung!", n);
        }

    }
}
