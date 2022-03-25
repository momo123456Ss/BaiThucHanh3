public class Diem {
    private double x;
    private double y;
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public Diem(){
        this.x = 0;
        this.y = 0;
    }
    public Diem(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void hienThi(){
        System.out.printf("(%.1f,%.1f)\n",this.x,this.y);
    }
    public double khoangCachGiuaHaiDiem(Diem p){
        return Math.sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y),2));
    }
    public static double dieuKienSongSong1(Diem p1,Diem p2){
        return (p1.x - p2.x)/(p1.y - p2.y);
    }
}
