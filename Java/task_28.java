
import java.util.Scanner;

public class task_28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        Double[] weigth = new Double[5];
        Double[] height = new Double[5];
        Double[] imc = new Double[5];
        String[] imc_humanized = new String[5];

        String stringInput;
        Double doubleInput;

        System.out.println("Input name + weigth + height");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Input name");
            stringInput = sc.nextLine();
            names[i] = stringInput;
            System.out.println("Input weight");
            doubleInput = sc.nextDouble();
            weigth[i] = doubleInput;
            System.out.println("Input height");
            doubleInput = sc.nextDouble();
            height[i] = doubleInput;

            sc.nextLine();
        }

        // IMC
        for (int i = 0; i < names.length; i++) {
            Double w = weigth[i];
            Double h = height[i];

            Double imc_calc = w / Math.pow(h, 2);
            imc[i] = imc_calc;
        }
        // IMC Humanized
        for (int i = 0; i < imc.length; i++) {
            Double IMC = imc[i];

            if (IMC < 20) {
                imc_humanized[i] = ("Bajo de peso"); 
            }else if (20 < IMC && IMC <= 25) {
                imc_humanized[i] = ("Peso Normal"); 
            }else if (25 < IMC && IMC < 30) {
                imc_humanized[i] = ("Sobrepeso"); 
            }else if (30 < IMC && IMC < 35) {
                imc_humanized[i] = ("Obesidad"); 
            }else if (35 <= IMC) {
                imc_humanized[i] = ("Obesidad morbida");
            }
        }

        System.out.println("Full List:");
        System.out.println("------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println("name: " + names[i]);
            System.out.println("weigth: " + weigth[i]);
            System.out.println("height: " + height[i]);
            System.out.println("IMC: " + imc[i]);
            System.out.println("humanized: " + imc_humanized[i]);
            System.out.println("------------------------");
        }

    }
}
