package problem6;

public class HinhTron {
    private ToaDo tam;
    private double banKinh;

    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi(){
        double chuVi = 2 * Math.PI * banKinh;
        return chuVi;
    }

    public double tinhDienTich(){
        double dienTich = Math.PI * Math.pow(banKinh,2);
        return dienTich;
    }
}
