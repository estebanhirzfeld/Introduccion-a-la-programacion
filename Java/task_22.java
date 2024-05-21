
import java.util.Scanner;

public class task_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = {"Steve", "Tony", "Montana", "John", "Locke", "Thomas", "Winston", "Julia", "Lucas", "Sawyer"};
        Boolean found = false;

        System.out.println("Search for a name:");
        String input = sc.nextLine();

        for (int i = 0; i < 10; i++) {
            if (names[i].equals(input)) {
                System.out.println("name: '" + names[i] + "' found on position: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("name not found on the list");
        }
    }
}
