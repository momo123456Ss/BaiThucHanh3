import java.util.ArrayList;

public class TestTaoDanhSachPhanSo {
    public static void main(String[] args) {
        ArrayList<PhanSo> phanSo = new ArrayList<>();
        phanSo.add(new PhanSo(7,3));
        phanSo.forEach(fr ->fr.hienThi());
    }
}
