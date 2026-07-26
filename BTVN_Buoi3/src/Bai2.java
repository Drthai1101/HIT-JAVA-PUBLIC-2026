import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String x = sc.nextLine();

        boolean doiXung = true;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != x.charAt(x.length() - 1 - i)) {
                doiXung = false;
                break;
            }
        }
        if (doiXung) {
            String vietHoa = x.toUpperCase();
            System.out.printf("%s chuỗi này đối xứng\n", vietHoa);
        }
        else {
            String vietThuong = x.toLowerCase();
            System.out.printf("%s chuỗi này không đối xứng\n", vietThuong);
        }

    }
}
