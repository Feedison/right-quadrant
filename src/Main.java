// Importing scanner library
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Announcing scanner
        Scanner console = new Scanner(System.in);

        // User input
        System.out.print("Enter x coordinate: ");
        int x = console.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = console.nextInt();

        // Checking what quadrant the coordinate located in
        if (x > 0 && y > 0)
            System.out.println("Coordinate ("+x+", "+y+") located in I quadrant.");
        else if (x < 0 && y > 0)
            System.out.println("Coordinate ("+x+", "+y+") located in II quadrant.");
        else if (x < 0 && y < 0)
            System.out.println("Coordinate ("+x+", "+y+") located in III quadrant.");
        else
            System.out.println("Coordinate ("+x+", "+y+") located in IV quadrant.");
    }
}
