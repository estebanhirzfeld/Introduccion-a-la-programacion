
import java.util.*;

public class task_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nro");
        Integer nro = sc.nextInt();
        System.out.println("Tabla de: " + nro);
        for (int i = 0; i <= 10; i++) {
            System.out.println(nro +  " x " + i + ": " + i * nro);
        }
    }
}
