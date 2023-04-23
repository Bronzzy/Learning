package problem1;

public abstract class HangHoa {
    private String maHang;
    private String tenHang;
    private double donGia;
    private int soLuongTon;

    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws SoLuongTonException, DonGiaException,
                                                                                        MaHangException, TenHangException {
        this.maHang = maHang;
        if(maHang == "") throw new MaHangException("Ma hang khong duoc rong");
        this.tenHang = tenHang;
        if (tenHang == "") throw new TenHangException("Ten hang khong duoc rong");
        this.donGia = donGia;
        if (donGia < 0) throw new DonGiaException("Don gian phai lon hon 0");
        this.soLuongTon = soLuongTon;
        if (soLuongTon < 0) throw new SoLuongTonException("So luong ton phai lon 0");
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public abstract double VAT();

}
