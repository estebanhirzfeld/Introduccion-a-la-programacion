
import java.util.Scanner;

public class task_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Numero");
        Integer number = sc.nextInt();
        String intToString = number.toString();
        for (int i = 0; i < intToString.length(); i++) {
            Integer aux = (int)(intToString.charAt(i) - '0');
            System.out.print("[" +  aux + "], " );
            System.out.println("[" +  aux * Math.pow(10, i)+ "] " );
        }
    }
}
