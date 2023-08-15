package phonebookentry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PhoneBookEntry> list = new ArrayList<PhoneBookEntry>();

        PhoneBookEntry an = new PhoneBookEntry("an", "1234");
        PhoneBookEntry binh = new PhoneBookEntry("binh", "5678");
        PhoneBookEntry vu = new PhoneBookEntry("vu", "9012");
        PhoneBookEntry huy = new PhoneBookEntry("huy", "3456");
        PhoneBookEntry liem = new PhoneBookEntry("liem", "7890");

        list.add(an);
        list.add(binh);
        list.add(vu);
        list.add(huy);
        list.add(liem);

        for (PhoneBookEntry entry : list) {
            System.out.println("Name: " + entry.getName() + "\tPhone: " + entry.getPhoneNumber());
        }
    }
}
