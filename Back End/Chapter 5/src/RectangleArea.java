import java.util.Scanner;

// Insert any necessary import statements here.

public class RectangleArea
{
    public static void main(String[] args)
    {
        double length,    // The rectangle's length
                width,     // The rectangle's width
                area;      // The rectangle's area

        // Get the rectangle's length from the user.
        length = getLength();

        // Get the rectangle's width from the user.
        width = getWidth();
//
//        // Get the rectangle's area.
        area = getArea(length, width);
//
//        // Display the rectangle data.
        System.out.println("Length is: " + length);
        System.out.println("Width is :" + width);
        System.out.println("Area is: " + area);
    }


    public static double getLength()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input rectangle length");
        double length = scanner.nextDouble();
        return length;
    }


    public static double getWidth ()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input rectangle width");
        double width = scanner.nextDouble();
        return width;
    }


    public static double getArea(double length, double width)
    {
        double area = length * width;
        return area;
    }

}


