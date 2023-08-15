package problem1;

import java.time.LocalDate;

public class HangDienMay extends HangHoa{
    private LocalDate thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon,
                       LocalDate thoiGianBaoHanh, double congSuat)
                        throws SoLuongTonException, DonGiaException, MaHangException, TenHangException {
        super(maHang, tenHang, donGia, soLuongTon);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    @Override
    public double VAT() {
        return super.getDonGia() * 0.1;
    }
}
