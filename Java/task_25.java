
import java.util.Scanner;

public class task_25 {

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
            System.out.println("Products List:");
            for (int i = 0; i < products.length; i++) {
                System.out.println(i + ": " + products[i]);
            }

            System.out.println("Type Index product to delete:");
            Integer input = sc.nextInt();

            if (last_pos == -1) {
                must_continue = false;
            }
            if (input.equals("")) {
                must_continue = false;
            } else {
                if (input >= 0 && input <= last_pos) {
                    products[input] = null;
                    products[input] = products[last_pos];
                    products[last_pos] = null;
                    last_pos--;
                    System.out.println("Removing: " + input + "...");
                } else {
                    System.out.println("Input: " + input + " out of range, ending program...");
                    must_continue = false;
                }
            }
        } while (must_continue);

        System.out.println("Final Products List:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + ": " + products[i]);
        }

    }
}
