
import java.util.*;

public class task_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer acc = 0;
        System.out.println("nro multiplos de 3 y a la vez son par");
        for (int i = 0; i <= 40; i++) {
            if (i % 2 == 0 && i % 7 == 0) {
                acc++;
                System.out.println(i);
            }
        }
        System.out.println("Total: " + acc);
    }
}
