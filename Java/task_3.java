import java.util.Scanner;

public class task_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String name = sc.nextLine();
        System.out.println("Ingrese apellido");
        String surname = sc.nextLine();
        System.out.println("Ingrese animal preferido");
        String animal = sc.nextLine();

        System.out.println("--------------------------");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(animal);
    }
}
