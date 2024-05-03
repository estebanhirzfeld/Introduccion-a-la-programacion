
import java.util.Scanner;


public class task_6 {
    public static void draw(Integer filas, Integer columnas) {
        String line = "";
        String space = "*";
        
        
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

    }
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            draw(i, i);
        }
        for (int i = 10; i < 0; i--) {
            draw(i, i);
        }
    }
}
