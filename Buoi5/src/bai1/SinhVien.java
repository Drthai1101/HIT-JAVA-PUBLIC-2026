package model;

public class SinhVien {
    private int maSV;
    private String ten;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien( int maSV, String ten,double diemHoa, double diemLy, double diemToan) {
        this.diemHoa = diemHoa;
        this.diemLy = diemLy;
        this.diemToan = diemToan;
        this.maSV = maSV;
        this.ten = ten;
    }

    public SinhVien() {
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public double diemTB() {
        return (getDiemToan()+getDiemLy()+getDiemHoa()) / 3;
    }

    public void info() {
        System.out.println("=== Student Info ===");
        System.out.println("Ten: " + getTen());
        System.out.println("Ma SV: " + getMaSV());
        System.out.println("Diem trung binh: " + diemTB());
    }



}
