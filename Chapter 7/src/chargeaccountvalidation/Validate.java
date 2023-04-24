package chargeaccountvalidation;

public class Validate {
    private int[] credit;

    public Validate(int[] credit) {
        this.credit = credit;
    }

    public int sequentialSearch(int[] array, int value) {

        int index = 0;
        int element = -1;
        boolean found = false;

        while (!found && index < credit.length) {
            if (credit[index] == value) {
                found = true;
                element = index;
            }
            index++;
        }
        return element;
    }
}
