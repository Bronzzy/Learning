package problem1;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa{
    private String nhaSanXuat;
    private LocalDate ngayNhapKho;

    public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon,
                      String nhaSanXuat, LocalDate ngayNhapKho) throws SoLuongTonException, DonGiaException, MaHangException, TenHangException {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public double VAT() {
        return super.getDonGia() * 0.1;
    }
}
