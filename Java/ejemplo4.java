import java.util.Scanner;

public class ejemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese Peso: ");
        int peso = sc.nextInt();
        System.out.println("Ingrese Estatura: ");
        int estatura = sc.nextInt();

        double imc = peso / (estatura * estatura);

        System.out.println("IMC: " + imc); 
    }
    
}