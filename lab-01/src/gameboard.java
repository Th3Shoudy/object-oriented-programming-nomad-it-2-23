import java.util.Random;
import java.util.Scanner;

public class gameboard {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        field field = new field(5);

        turtleeee turtle = new turtleeee(
                random.nextInt(field.getSize()),
                random.nextInt(field.getSize()),
                random.nextInt(4)
        );

        System.out.println("turtleeee are here!!");
        field.printField(turtle);

        while (true) {

            System.out.println("1 - W | 2 - D | 3 - A | 0 - esc");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("turtleeee waiting you");
                break;
            }

            if (choice == 1) {
                turtle.moveForward(field.getSize());
            } else if (choice == 2) {
                turtle.turnRight();
            } else if (choice == 3) {
                turtle.turnLeft();
            }

            field.printField(turtle);
        }

        scanner.close();
    }
}