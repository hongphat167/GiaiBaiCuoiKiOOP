import java.util.Date;

public class DenHuynhQuang extends ThietBiDaDung implements ThueMoiTruong {

    private final static float THUE_BVMT = 0.02F;
    private float chieuDaiBong;

    public DenHuynhQuang() {
    }

    public DenHuynhQuang(String ma, String ten, String congSuat, String hangSanXuat, Date ngaySanXuat, String thoiGianBaoHanh, float giaBanDeXuat, float chieuDaiBong) {
        super(ma, ten, congSuat, hangSanXuat, ngaySanXuat, thoiGianBaoHanh, giaBanDeXuat);
        this.chieuDaiBong = chieuDaiBong;
    }

    public float getChieuDaiBong() {
        return chieuDaiBong;
    }

    public void setChieuDaiBong(float chieuDaiBong) {
        this.chieuDaiBong = chieuDaiBong;
    }

    @Override
    public void input() {
        System.out.println("Nhập thông tin đèn huỳnh quang");
        this.setChieuDaiBong(Util.inputFloat("Nhập chiều dài bóng: "));
        super.input();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Đèn huỳnh quang {");
        sb.append(super.toString());
        sb.append(", chieuDaiBong").append(chieuDaiBong);
        sb.append("}");
        return sb.toString();
    }

    @Override
    public float tinhGiaBan() {
        return this.getGiaBanDeXuat() + tinhThueMoiTruong() + tinhThueGiaTriGiaTang();
    }

    @Override
    public float tinhThueMoiTruong() {
        return DenHuynhQuang.THUE_BVMT * getGiaBanDeXuat();
    }
}
