
import java.util.Scanner;

public class task_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = new String[10];
        products[0] = "Zanahorias";
        products[1] = "Cebollas";
        products[2] = "Tomates";
        products[3] = "Papas";

        int last_pos = 3;
        boolean must_continue = true;

        do {
            System.err.println("Type Product:");
            String input = sc.nextLine();
            if (last_pos == products.length - 2) {
                must_continue = false;
            }
            if (input.equals("")) {
                must_continue = false;
            } else {
                last_pos++;
                products[last_pos] = input;
                System.err.println("Adding: " + input + "...");
            }
        } while (must_continue);

        System.err.println("Products List:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + ": " + products[i]);
        }
    }
}
