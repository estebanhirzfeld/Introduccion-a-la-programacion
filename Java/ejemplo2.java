import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "Todos los dias el Sol nace de aquella la montaña";

        // upperCase
        System.out.println(texto.toUpperCase());

        // length
        System.out.println(texto.length());

        // CharAt
        System.out.print(texto.charAt(0));
        System.out.print(texto.charAt(texto.length()/2));
        System.out.println(texto.charAt(texto.length()-1));

        char letter = texto.charAt(texto.length()-1);
        
        // int
        System.out.println((int)letter);
        
        int inputInt = sc.nextInt();
        
        System.out.println(inputInt + 2);

    }
    
}