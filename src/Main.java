import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ThietBiDaDung> danhSachDen = new ArrayList<>();

        DenSoiDot denSoiDot = new DenSoiDot();
        denSoiDot.input();
        danhSachDen.add(denSoiDot);

        DenHuynhQuang denHuynhQuang = new DenHuynhQuang();
        denHuynhQuang.input();
        danhSachDen.add(denHuynhQuang);

        DenLed denLed = new DenLed();
        denLed.input();
        danhSachDen.add(denLed);

        // In thông tin các đèn
        System.out.println("Thông tin các đèn:");
        for (ThietBiDaDung den : danhSachDen) {
            den.output();
            System.out.println("Giá bán cuối cùng: " + den.tinhGiaBan());
            System.out.println();
        }
    }
}
