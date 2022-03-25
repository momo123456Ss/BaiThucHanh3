import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class HocVien {
//    private String hoTen;
//    private String ngaySinh;
//    private String queQuan;
//    private double diemToan;
//    private double diemAnh;
//    private double diemVan;
//    private static int dem = 0;
//    private int maHV;
//    {
//        dem++;
//        this.maHV = dem;
//    }
//    public HocVien(String hoTen, String queQuan, String ngaySinh,double diemToan,double diemAnh,double diemVan){
//        this.hoTen = hoTen;
//        this.queQuan = queQuan;
//        this.ngaySinh = ngaySinh;
//        this.diemAnh = diemAnh;
//        this.diemToan = diemToan;
//        this.diemVan = diemVan;
//    }
//    public HocVien(String hoTen, String queQuan, String ngaySinh){
//        this.hoTen = hoTen;
//        this.queQuan = queQuan;
//        this.ngaySinh = ngaySinh;
//    }
//
//    public String getHoTen() {
//        return hoTen;
//    }
//
//    public void setHoTen(String hoTen) {
//        this.hoTen = hoTen;
//    }
//
//    public String getNgaySinh() {
//        return ngaySinh;
//    }
//
//    public void setNgaySinh(String ngaySinh) {
//        this.ngaySinh = ngaySinh;
//    }
//
//    public String getQueQuan() {
//        return queQuan;
//    }
//
//    public void setQueQuan(String queQuan) {
//        this.queQuan = queQuan;
//    }
//    public void  hienThiDaNhapDiem(){
//        System.out.println("Mã HV : " + this.maHV + "\nTên : "+this.hoTen + "\nQue Quán: "+this.queQuan +"\nNgay Sinh: "+this.ngaySinh + "\nDiem : " + (this.diemVan+this.diemToan+this.diemAnh)/3);
//    }
//    public void  hienThi(){
//        System.out.println("Mã HV : " + this.maHV + "\nTên : "+this.hoTen + "\nQue Quán: "+this.queQuan +"\nNgay Sinh: "+this.ngaySinh);
//    }
//
//    public double getDiemToan() {
//        return diemToan;
//    }
//
//    public void setDiemToan(double diemToan) {
//        this.diemToan = diemToan;
//    }
//
//    public double getDiemAnh() {
//        return diemAnh;
//    }
//
//    public void setDiemAnh(double diemAnh) {
//        this.diemAnh = diemAnh;
//    }
//
//    public double getDiemVan() {
//        return diemVan;
//    }
//
//    public void setDiemVan(double diemVan) {
//        this.diemVan = diemVan;
//    }
//    public double nhapDiemToan(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập điểm toán: ");
//        this.diemToan = sc.nextDouble();
//        return this.diemToan;
//    }
//    public double nhapDiemAnh(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập điểm toán: ");
//        this.diemAnh = sc.nextDouble();
//        return this.diemAnh;
//    }
//    public double nhapDiemVan(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập điểm toán: ");
//        this.diemVan = sc.nextDouble();
//        return  this.diemVan;
//    }
    private static final int SO_MON = 3;
    private static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    private static final Scanner sc = new Scanner(System.in);
    private static int dem = 0;
    private int maHV = ++dem;
    private String tenHV;
    private String queQuan;
    private Date ngaySinh;
    private double[] diem;

    public HocVien(String ht,String qq,Date ns){
        this.tenHV = ht;
        this.queQuan =qq;
        this.ngaySinh = ns;
    }

    public HocVien(String ht,String qq,String ns) throws ParseException {
        this.ngaySinh = f.parse(ns);
        this.tenHV = ht;
        this.queQuan =qq;
    }

    public void hienThi(){
        System.out.printf("Mã HV : %d\n",this.maHV);
        System.out.printf("Họ tên : %s\n",this.tenHV);
        System.out.printf("Quê quán : %s\n",this.queQuan);
        System.out.printf("Quê quán : %s\n",f.format(this.ngaySinh));
        if (this.diem != null){
            for (double d : this.diem){
                System.out.printf("%.2f\t",d);
            }
            System.out.println();
        }
    }

    public void nhapDiem(){
        this.diem = new double[SO_MON];
        System.out.printf("Nhập điểm cho %s\n",this.tenHV.toUpperCase());
        for (int i = 0 ;i < SO_MON ; i++){
            System.out.printf("Nhập điểm môn %d\n",i+1);
            this.diem[i] = sc.nextDouble();
        }
    }

    public double tinhDiem(){
        return DoubleStream.of(this.diem).average().getAsDouble();
//        double tong = 0;
//        for (double d : this.diem){
//            tong+= d;
//        }
//        return tong/SO_MON;
    }

    public int soSamh(HocVien h){
        double tb1 = this.tinhDiem();
        double tb2 = h.tinhDiem();

        return tb1>tb2?1:(tb1<tb2?-1:0);
    }

    public boolean isHocBong(){
        double tong = 0;
        for (double h:this.diem){
            if (h  < 5) return false;
            else tong+=h;
        }
        return tong/SO_MON >=8;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double[] getDiem() {
        return diem;
    }

    public void setDiem(double[] diem) {
        this.diem = diem;
    }
}
