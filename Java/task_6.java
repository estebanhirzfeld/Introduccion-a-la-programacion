
import java.util.Scanner;


public class task_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = "* * * * * * * *";
        String space = "*             *";
        
        
        System.out.println("Ingrese cant de columnas");
        int filas = sc.nextInt();
        System.out.println(line);
        for (int i = 0; i < filas; i++) {
            System.out.println(space);
        }   
        System.out.println(line);
        System.out.println("line: " + line.length());
        System.out.println("space: " + space.length());
    }
}
