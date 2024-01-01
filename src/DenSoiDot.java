import java.util.Date;

public class DenSoiDot extends ThietBiDaDung implements ThueMoiTruong {

    private final static float THUE_BVMT = 0.02F;
    public DenSoiDot() {
    }

    public DenSoiDot(String ma, String ten, String congSuat, String hangSanXuat, Date ngaySanXuat, String thoiGianBaoHanh, float giaBanDeXuat) {
        super(ma, ten, congSuat, hangSanXuat, ngaySanXuat, thoiGianBaoHanh, giaBanDeXuat);
    }

    @Override
    public void input() {
        System.out.println("Nhập thông tin đèn sợi đốt");
        super.input();
    }

    @Override
    public float tinhGiaBan() {
        return this.getGiaBanDeXuat() + tinhThueMoiTruong() + tinhThueGiaTriGiaTang();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Đèn sợi đốt{");
        sb.append(super.toString());
        sb.append("}");
        return sb.toString();
    }
    @Override
    public float tinhThueMoiTruong() {
        return DenSoiDot.THUE_BVMT * getGiaBanDeXuat();
    }
}
