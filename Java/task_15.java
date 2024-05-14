import java.util.Scanner;

public class task_15 {

    public static void main(String[] args) {
        String email;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un email:");
            email = sc.nextLine();
        } while (!email.contains("@") | !email.contains(".com"));

        System.out.println("email: " + email);
        System.out.println("Valido");
    }
}
