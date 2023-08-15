import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 6};
//        int[] b = {5, 6, 7, 8, 9};
//        int[] d = {1, 2, 3, 4, 5};
//        int[] e = {5, 6, 7, 8, 9};
//
//
//        int[] c = questionA(a, b);
//        int[] f = questionB(d, e);

//        printArray(c);
//        printArray(f);

        int[] h = {6, 7, 8, 9, 10};
        int[] j = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] k = questionC(h, j);
        printArray(k);
    }

    public static int[] questionA(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = a.length; i < (a.length + b.length); i++) {
            c[i] = b[i - a.length];
        }
        return c;
    }

    public static int[] questionB(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    public static int[] questionC(int[] a, int[] b) {
        int[] c;
        if (a.length > b.length) {
            c = new int[a.length];
            for (int i = 0; i < b.length; i++) {
                c[i] = a[i] + b[i];
            }
            for (int i = b.length; i < a.length; i++) {
                c[i] = a[i];
            }
        } else {
            c = new int[b.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] + b[i];
            }
            for (int i = a.length; i < b.length; i++) {
                c[i] = b[i];
            }
        }
        return c;
    }

    public static void printArray(int[] a) {
        for (Integer numb :
                a) {
            System.out.println(numb);
        }
    }
}
