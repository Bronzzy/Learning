package personalinformationclass;

public class Main {
    public static void main(String[] args) {
        PersonalInformation binh = new PersonalInformation("Binh", "81 duong 40", 28, "0909301777");
        PersonalInformation an = new PersonalInformation("An", "SCS Building, 2nd Floor, 4 D1 Street", 28, "090478372");
        PersonalInformation vinh = new PersonalInformation("Vinh", "VQ79+7X3, Đ. số 13", 67, "0909301777");

        System.out.println(binh);
        System.out.println(an);
        System.out.println(vinh);
    }
}
