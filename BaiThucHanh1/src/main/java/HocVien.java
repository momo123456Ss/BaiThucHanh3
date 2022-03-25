public class HocVien {
    private static int dem = 0;
    private int maHV;
    {
        dem++;
        this.maHV = dem;
    }
    private String hoTen;
    private String queQuan;
    private String ngaySinh;
    private DiemMonHoc diem;

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public DiemMonHoc getDiem() {
        return diem;
    }

    public void setDiem(DiemMonHoc diem) {
        this.diem = diem;
    }
}
