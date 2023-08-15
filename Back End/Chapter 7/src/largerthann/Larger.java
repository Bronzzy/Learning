package largerthann;

public class Larger {
    private int[] array;

    public Larger(int[] array) {
        this.array = array;
    }

    public void compare(int[] array, int value) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] > value) {
                System.out.println(array[index]);
            }
        }
    }
}
