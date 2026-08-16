package app;
import model.SinhVien;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> ds = new ArrayList<>();

        SinhVien s1 = new SinhVien(2025, "Nam", 6.9, 7.2, 8.3);
        SinhVien s2 = new SinhVien(2026, "Trang", 8.2, 8.5, 8.9);

        ds.add(s1);
        ds.add(s2);

        for (SinhVien sv : ds) {
            sv.info();
        }

        SinhVien svMax = ds.get(0);

        for (SinhVien sv : ds) {
            if (sv.diemTB() > svMax.diemTB()) {
                svMax = sv;
            }
        }
        System.out.println("Sinh viên có điểm cao nhất: ");
        System.out.println("Tên: " + svMax.getTen());
        System.out.println("Điểm TB: " + svMax.diemTB());
    }
}