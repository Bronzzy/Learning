package problem2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MaCongNhanExpCeption {
        int input;
        Scanner kb = new Scanner(System.in);
        DanhSachCongNhan danhSachCongNhan = new DanhSachCongNhan();
        do {
            System.out.println("\nMenu:" +
                    "\n1. Thêm 1 công nhân" +
                    "\n2. Thêm nhiều công nhân" +
                    "\n3. Xuất toàn bộ thông tin công nhân" +
                    "\n4. Xuất thông tin các công nhân làm trên 200 sản phẩm" +
                    "\n5. Sắp xếp công nhân theo số sản phẩm giảm dần" +
                    "\n6. Thoát");
            input = kb.nextInt();
            kb.nextLine();
            switch (input) {
                case 1:
                    danhSachCongNhan.themCongNhan();
                    break;
                case 2:
                    danhSachCongNhan.themNhieuCongNhan();
                    break;
                case 3:
                    danhSachCongNhan.xuatToanBoThongTinCongNhan();
                    break;
                case 4:
                    danhSachCongNhan.congNhanLamTren200SanPham();
                    break;
                case 5:
                    danhSachCongNhan.sapXepCongNhanTheoSoSanPhamGiamDan();
                    break;
                case 99:
                    lazyinit(danhSachCongNhan);
                    break;
            }
        } while (input != 6);
    }

    public static void lazyinit(DanhSachCongNhan danhSachCongNhan) {
        danhSachCongNhan.addCongNhan(new CongNhan("01", "Dao", "Binh", 201));
        danhSachCongNhan.addCongNhan(new CongNhan("02", "Bui", "Vu", 700));
        danhSachCongNhan.addCongNhan(new CongNhan("03", "Truong", "An", 57));
        danhSachCongNhan.addCongNhan(new CongNhan("04", "Chuong", "Kiet", 15));
        danhSachCongNhan.addCongNhan(new CongNhan("05", "Tran", "Nhut", 300));
    }
}
