import java.util.Date;

public abstract class ThietBiDaDung {
    private String ma;
    private String ten;
    private String congSuat;
    private String hangSanXuat;
    private Date ngaySanXuat;
    private String thoiGianBaoHanh;
    private float giaBanDeXuat;

    private final static float THUE_GTGT = 0.1F;

    public ThietBiDaDung() {
    }

    public ThietBiDaDung(String ma, String ten, String congSuat, String hangSanXuat, Date ngaySanXuat, String thoiGianBaoHanh, float giaBanDeXuat) {
        this.ma = ma;
        this.ten = ten;
        this.congSuat = congSuat;
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.giaBanDeXuat = giaBanDeXuat;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }


    public void setGiaBanDeXuat(float giaBanDeXuat) {
        this.giaBanDeXuat = giaBanDeXuat;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public float getGiaBanDeXuat() {
        return giaBanDeXuat;
    }

    public void input() {
        this.setMa(Util.inputString("Nhập mã đèn"));
        this.setTen(Util.inputString("Nhập tên đèn"));
        this.setCongSuat(Util.inputString("Nhập Công Suất"));
        this.setHangSanXuat(Util.inputString("Nhập hãng sản xuất"));
        this.setNgaySanXuat(Util.inputDate("Nhập ngày sản xuât"));
        this.setThoiGianBaoHanh(Util.inputString("Nhập thời gian bảo hành"));
        this.setGiaBanDeXuat(Util.inputFloat("Nhập giá bán"));
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ma=").append(ma);
        sb.append(", ten=").append(ten);
        sb.append(", congSuat=").append(congSuat);
        sb.append(", hangSanXuat=").append(hangSanXuat);
        sb.append(", ngaySanXuat=").append(ngaySanXuat);
        sb.append(", thoiGianBaoHanh=").append(thoiGianBaoHanh);
        sb.append(", giaBanDeXuat=").append(giaBanDeXuat);
        return sb.toString();
    }

    public float tinhThueGiaTriGiaTang() {
        return getGiaBanDeXuat() * ThietBiDaDung.THUE_GTGT;
    }

    public float tinhGiaBan() {
        return this.getGiaBanDeXuat() + tinhThueGiaTriGiaTang();
    }
}
