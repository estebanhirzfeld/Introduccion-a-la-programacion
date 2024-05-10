
import java.util.*;

public class task_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        String palabra_inv = "";
        for (int i = palabra.length()-1; i >= 0; i--) {
            palabra_inv = palabra_inv + palabra.charAt(i);
        }
        if (palabra.equals(palabra_inv)){
            System.out.println(palabra + " es Paliddromo");
        }else {
            System.out.println(palabra + " NO es Paliddromo");
        }
    }
}
