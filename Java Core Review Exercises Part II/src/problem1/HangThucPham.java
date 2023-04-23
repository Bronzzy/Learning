package problem1;

import java.time.LocalDate;

public class HangThucPham extends HangHoa{
    private String nhaCungCap;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon,
                        String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan)
                         throws SoLuongTonException, DonGiaException, MaHangException, TenHangException {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaCungCap = nhaCungCap;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public double VAT() {
        return super.getDonGia() * 0.05;
    }
}
