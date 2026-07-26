import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 3 số nguyên A,B,C phân biệt: \n");
        System.out.print("A: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("B: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("C: ");
        int c = Integer.parseInt(sc.nextLine());

        int trungVi = ((a < b && a > c) || (a > b && a < c) ? a : (b < a && b > c) || (b > a && b < c) ? b : c);

        System.out.printf("Số trung vị: %d", trungVi);

    }
}
