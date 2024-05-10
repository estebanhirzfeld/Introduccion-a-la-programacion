
import java.util.*;

public class task_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer acc = 0;
        System.out.println("nro multiplos de 3 o 4");
        for (int i = 0; i <= 40; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                acc++;
                System.out.println(i);
            }
        }
        System.out.println("Total: " + acc);
    }
}
