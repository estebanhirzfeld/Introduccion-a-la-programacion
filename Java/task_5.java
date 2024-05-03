import java.util.Scanner;

public class task_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String name = sc.nextLine();

        String first_3_name = name.substring(0,3);
        System.out.println("first 3: " + first_3_name);

        System.out.println("Ingrese apellido");
        String surname = sc.nextLine();

        String first_3_surname = surname.substring(0,3);
        System.out.println("first 3: " + first_3_surname);

        System.out.println("Ingrese color preferido");
        String color = sc.nextLine();
        

    }
}
