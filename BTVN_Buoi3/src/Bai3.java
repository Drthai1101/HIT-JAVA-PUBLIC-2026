import java.util.Scanner;
import java.util.Random;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(201);

        System.out.printf("%d + %d = %d\n", a, b, c);
        String x = sc.nextLine();
        boolean kiemTra = (a + b == c);
        if ((kiemTra && x.equals("phép tính đúng")) || (!kiemTra && x.equals("phép tính sai"))) {
            System.out.println("Bạn đã trả lời đúng!");
        }
        else {
            System.out.println("Bạn đã trả lời sai!");
        }

    }
}
