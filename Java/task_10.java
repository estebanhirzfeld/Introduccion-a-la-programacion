
import java.util.*;

public class task_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer acc = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                acc++;
                System.out.println(i + ", es un nro Par");
            }
        }
        System.out.println("Total: " + acc);
    }
}
