import java.time.Year;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args){
        final int current_year = Year.now().getValue();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese año de nacimiento");
        Integer year = sc.nextInt();

        Integer age = current_year - year;

        System.out.println("Edad calculada: "+ age);
    }
}
