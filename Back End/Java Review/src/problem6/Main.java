package problem6;

public class Main {
    public static void main(String[] args) {

        ToaDo toaDo = new ToaDo(5, 5);
        HinhTron hinhTron = new HinhTron(toaDo, 10.5);

        System.out.println("Hình tròn có tâm O(" + toaDo.getX() + "," + toaDo.getY() + ") với bán kính "
                + hinhTron.getBanKinh() + " có diện tích và chu vi lần lượt là " + hinhTron.tinhDienTich()
                + " và " + hinhTron.tinhChuVi());
    }
}
