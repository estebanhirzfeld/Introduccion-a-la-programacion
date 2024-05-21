
import java.util.Scanner;

public class task_20 {

    public static String arrayToString(String[] array) {
        String output = "";
        for (int i = 0; i < array.length; i++) {
            output = output + array[i] + " ";
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = {"Steve", "Tony", "John"};
        String name = names[0];

        System.out.println(name);
        String x = arrayToString(names);
        System.out.println(x);

    }
}
