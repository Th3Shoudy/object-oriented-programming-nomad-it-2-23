import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class task4 {
    public static void main(String[] args) {
        ArrayList<String> contactsInPhone = new ArrayList<>();
        contactsInPhone.add("Melina");
        contactsInPhone.add("Malenia");
        contactsInPhone.add("Midyr");

        ArrayList<String> contactsInSim = new ArrayList<>();
        contactsInSim.add("Maliketh");
        contactsInSim.add("Marika");
        contactsInSim.add("Manus");

        ArrayList<String> Allcontacts = new ArrayList<>();
        for (String contact : contactsInPhone) {
            if (!Allcontacts.contains(contact)) {
                Allcontacts.add(contact);
            }
        }
        for (String contact : contactsInSim) {
            if (!Allcontacts.contains(contact)) {
                Allcontacts.add(contact);
            }
        }
        Collections.sort(Allcontacts);

        System.out.println("all");
        for (String contact : Allcontacts) {
            System.out.println(contact);
        }
    }
}