import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeNumberList {
    public static void main(String[] args) {
        List<Integer> primeList = new ArrayList<>();
        int i = 2;
        while (primeList.size() < 100) {
            if (isPrime(i)) {
                primeList.add(i);
            }
            i++;
        }
        Iterator<Integer> primeIterator = primeList.iterator();
        while (primeIterator.hasNext()) {
            System.out.println(primeIterator.next());
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
