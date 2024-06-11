
import java.util.Scanner;

public class exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[20];
        Integer counter = 0;
        System.out.println("Ingrese Palabras (max 20)");
        String word = null;
        do {
            word = sc.nextLine();
            words[counter] = word;
            counter++;
            if (counter >= 20) {
                break;
            }

        } while (!"".equals(word));

        System.out.println("Iniciar Busqueda por inicial:");
        Character search = sc.nextLine().charAt(0);
        for (int i = 0; i <= words.length; i++) {
            if (words[i] != null && words[i].charAt(0) == search) {
                System.out.println(i + ": " + words[i]);
            }
        }
    }

}
