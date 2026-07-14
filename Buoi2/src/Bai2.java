import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tinh nam nhuan!");
        System.out.println("Nhap nam: ");
        int year = sc.nextInt();

        if (year % 4 == 0 || year % 100 != 0) {
            System.out.printf("Nam %d la nam nhuan", year);
        }
        else {
            System.out.printf("Nam %d la nam khong nhuan", year);
        }

    }
}
