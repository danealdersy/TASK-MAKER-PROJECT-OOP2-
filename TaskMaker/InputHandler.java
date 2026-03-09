import java.util.Scanner;

public class InputHandler {

    private Scanner scanner = new Scanner(System.in);

    public String getString(String message) {

        System.out.print(message);
        return scanner.nextLine();

    }

    public int getInt(String message) {

        while (true) {
            try {
                System.out.print(message);
                int value = Integer.parseInt(scanner.nextLine());
                return value;
            } catch (Exception e) {
                System.out.println("Invalid input! Enter a number.");
            }
        }

    }

}