import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ho ten: ");
        String name = sc.nextLine();

        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.printf("Xin chao %s - Ban %d tuoi roi!%n", name, age);

    }
}