import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tinh chu vi(P), dien tich(S) hinh chu nhat");

        System.out.println("Nhap chieu dai: ");
        double a = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double b = sc.nextDouble();

        System.out.println("Chu vi P = " + 2*(a+b));
        System.out.println("Dien tich S = " + a*b);

    }
}