
import java.util.Objects;
import java.util.Scanner;

public class task_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numbers[] = {1, 2, 3, 4};
        Integer x[] = new Integer[4];
        Boolean flag = false;

        System.out.println("Enter a number:");

        for (int i = 0; i < numbers.length; i++) {
            Integer input = sc.nextInt();
            numbers[i] = input;
        }
        if (x.length == numbers.length) {
            for (int i = 0; i < numbers.length; i++) {
                if (Objects.equals(x[i], numbers[i])) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Arrays iguales");
            } else {
                System.out.println("Arrays Distintos");
            }
        }
    }
}
