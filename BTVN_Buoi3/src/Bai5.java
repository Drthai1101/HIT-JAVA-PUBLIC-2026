import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: \n");
        int n = sc.nextInt();
        int[] dayNui = new int[n];

        for (int i = 0; i < n; i++) {
            dayNui[i] = sc.nextInt();
        }
        int dem = 0;
        int step = 0;
        int truocDo = 0;
        int hienTai = 0;

        for (int x : dayNui) {
            if (step >= 2) {
                if (truocDo < hienTai && hienTai > x) {
                    dem++;
                }
            }

            truocDo = hienTai;
            hienTai = x;
            step++;
        }
        System.out.printf("Số lượng đỉnh núi: %d", dem);

    }
}
