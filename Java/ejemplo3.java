import java.util.Scanner;

public class ejemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nro para A: ");
        int A = sc.nextInt();
        System.out.println("Ingrese nro para B: ");
        int B = sc.nextInt();
        System.out.println("Ingrese nro para C: ");
        int C = sc.nextInt();

        int suma = A + B + C;
        int producto = A * B * C;
        double promedio = ((double)suma) / 3;

        System.out.println("Suma: " + suma); 
        System.out.println("Producto: " + producto); 
        System.out.println("Promedio: " + promedio); 
    }
    
}