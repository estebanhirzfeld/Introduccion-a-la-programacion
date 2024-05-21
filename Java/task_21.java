import java.util.Scanner;

public class task_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Set a new name:");
            String input = sc.nextLine();
            names[i] = input;
        }

        System.out.println("Names loaded:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
