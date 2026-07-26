import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        double pi = 3.14;
        do {
            System.out.print("Nhập bán kính r: ");
            r = sc.nextDouble();
            if (r <= 0 || r >= 1000) {
                System.out.print("Không hợp lệ! Nhập lại!\n");
            }
        } while (r <= 0 || r>= 1000);

        double C = 2 * pi * r;
        double S = pi * Math.pow(r, 2);
        System.out.printf("%.3f %.3f", C, S);

    }
}