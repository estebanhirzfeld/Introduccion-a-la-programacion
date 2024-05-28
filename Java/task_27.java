
import java.util.Scanner;

public class task_27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = new String[10];
        products[0] = "Zanahorias";
        products[1] = "Cebollas";
        products[2] = "Tomates";
        products[3] = "Papas";

        int last_pos = 3;
        String search = sc.nextLine();
        Boolean was_found = false;

        // Clean products array
        for (int i = 0; i <= last_pos; i++) {
            if (products[i].toLowerCase().equals(search.toLowerCase())) {
                System.out.print("Product: '" + products[i] + "' Found!");
                System.out.print(", at position: " + i);
                was_found = true;
                break;
            }
        }
        if (!was_found) {
            System.out.println("Product: " + search + " was not found");
        }

    }
}
