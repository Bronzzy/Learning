package problem2;

public class CongNhan {
    private String maCN;
    private String mHo;
    private String mTen;
    private int mSoSp;

    public CongNhan(String maCN, String mHo, String mTen, int mSoSp) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSp = mSoSp;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSp() {
        return mSoSp;
    }

    public void setmSoSp(int mSoSp) {
        this.mSoSp = mSoSp;
    }

    public void tinhLuong() {
        double luong;
        if (mSoSp < 200) {
            luong = mSoSp * 0.5;
        }
        if (mSoSp < 400) {
            luong = mSoSp * 0.55;
        }
        if (mSoSp < 600) {
            luong = mSoSp * 0.6;
        } else {
            luong = mSoSp * 0.65;
        }
    }

    @Override
    public String toString() {
        return "\nThong tin cong nhan" +
                "\nMa CN: " + maCN +
                "\nMa Ho: " + mHo +
                "\nMa Ten: " + mTen +
                "\nSo Sp: " + mSoSp;
    }
}
