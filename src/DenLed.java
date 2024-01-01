import java.util.Date;

public class DenLed extends ThietBiDaDung {
    private String loaiLed;

    public DenLed() {
    }

    public DenLed(String ma, String ten, String congSuat, String hangSanXuat, Date ngaySanXuat, String thoiGianBaoHanh, float giaBanDeXuat, String loaiLed) {
        super(ma, ten, congSuat, hangSanXuat, ngaySanXuat, thoiGianBaoHanh, giaBanDeXuat);
        this.loaiLed = loaiLed;
    }

    public String getLoaiLed() {
        return loaiLed;
    }

    public void setLoaiLed(String loaiLed) {
        this.loaiLed = loaiLed;
    }

    @Override
    public void input() {
        System.out.println("Nhập thông tin đèn LED");
        this.setLoaiLed(Util.inputString("Nhập loại led: "));
        super.input();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Đèn LED{");
        sb.append(super.toString());
        sb.append(", loaiLed").append(loaiLed);
        sb.append("}");
        return sb.toString();
    }
}
