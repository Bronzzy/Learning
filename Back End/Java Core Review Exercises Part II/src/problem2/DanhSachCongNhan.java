package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DanhSachCongNhan {
    Scanner kb = new Scanner(System.in);
    List<CongNhan> danhSachCongNhan = new ArrayList<>();

    public void addCongNhan(CongNhan congNhan) {
        danhSachCongNhan.add(congNhan);
    }

    public void themCongNhan() throws MaCongNhanExpCeption {
        System.out.println("Nhap ma CN cua cong nhan ");
        String maCN = kb.nextLine();
        for (int j = 0; j < danhSachCongNhan.size(); j++) {
            if (maCN.equalsIgnoreCase(danhSachCongNhan.get(j).getMaCN()))
                throw new MaCongNhanExpCeption("Ma cong nhan khong duoc trung");
            System.out.println("Nhap ma Ho cua cong nhan ");
            String mHo = kb.nextLine();
            System.out.println("Nhap ma Ten cua cong nhan ");
            String mTen = kb.nextLine();
            System.out.println("Nhap ma so san pham cua cong nhan ");
            int mSoSP = kb.nextInt();
            kb.nextLine();
            CongNhan congNhan = new CongNhan(maCN, mHo, mTen, mSoSP);
            danhSachCongNhan.add(congNhan);
        }
    }

    public void themNhieuCongNhan() throws MaCongNhanExpCeption {
        System.out.println("Nhap so luong cong nhan ban muon them vao");
        int soLuong = kb.nextInt();
        kb.nextLine();

        for (int i = 0; i <= soLuong; i++) {
            System.out.println("Nhap ma CN cua cong nhan " + i);
            String maCN = kb.nextLine();
            for (int j = 0; j < danhSachCongNhan.size(); j++) {
                if (maCN.equalsIgnoreCase(danhSachCongNhan.get(j).getMaCN()))
                    throw new MaCongNhanExpCeption("Ma cong nhan khong duoc trung");
                System.out.println("Nhap ma Ho cua cong nhan " + i);
                String mHo = kb.nextLine();
                System.out.println("Nhap ma Ten cua cong nhan " + i);
                String mTen = kb.nextLine();
                System.out.println("Nhap ma so san pham cua cong nhan " + i);
                int mSoSP = kb.nextInt();
                kb.nextLine();
                CongNhan congNhan = new CongNhan(maCN, mHo, mTen, mSoSP);
                danhSachCongNhan.add(congNhan);
            }
        }
    }

    public void xuatToanBoThongTinCongNhan() {
        for (CongNhan danhSach : danhSachCongNhan) {
            System.out.println(danhSach);
        }
    }

    public void tinhSoLuongCongNhan() {
        int count = 0;
        for (CongNhan danhSach : danhSachCongNhan) {
            count++;
        }
        System.out.println("So luong cong nhan: " + count);
    }

    public void congNhanLamTren200SanPham() {
        for (CongNhan danhSach : danhSachCongNhan) {
            if (danhSach.getmSoSp() > 200) {
                System.out.println(danhSach);
            }
        }
    }

    public void sapXepCongNhanTheoSoSanPhamGiamDan() {

    }
}

