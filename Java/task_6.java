
import java.util.Scanner;


public class task_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = "";
        // String line = "* * * * * * * *";
        String space = "*";
        
        
        System.out.println("Ingrese cant de columnas");
        int columnas = sc.nextInt();
        System.out.println("Ingrese cant de filas");
        int filas = sc.nextInt();

        // Columnas
        for (int i = 0; i < columnas; i++) {
            line = line + "* ";
        }   
        
        // Filas
        for (int i = 0; i < columnas*2-3; i++) {
            space = space + " ";
        }   
        // Square
        System.out.println(line.strip());

        for (int i = 0; i < filas-2; i++) {
            System.out.println(space + "*");
        }   

        System.out.println(line.strip());

        System.out.println("line: " + line.length());
        System.out.println("space: " + space.length());
    }
}
