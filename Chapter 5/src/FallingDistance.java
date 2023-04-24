public class FallingDistance {
    public static void main(String[] args) {

        System.out.println("Second\t\t " + "Fallingdistance ");
        for (int second = 1; second <= 10; second++)
            fallingDistance(second);

    }
    public static double fallingDistance (int second) {

        double d = (9.8 * Math.pow(second,2)/2);
            System.out.printf("%d" + "\t\t\t" + " %.2f\n",second,d);
        return d;
        }
    }


