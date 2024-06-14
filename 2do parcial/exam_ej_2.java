
// 10 estudiantes, nombres y notas (una sola)
// nombre por usuario, nota aleatoria
import java.util.Scanner;

public class exam_ej_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cant. de km a recorrer:");

        Double km = sc.nextDouble();
        Integer cantParadas = (int) (km / 100);
        Integer counterEstacion = 0;
        Double kmRecorrido = 0.0;
        System.out.println("cant de paradas:" + cantParadas);

        String[] estaciones = new String[cantParadas];
        Double[] kmEstaciones = new Double[cantParadas];

        sc.nextLine();
        for (int i = 0; i < estaciones.length; i++) {
            System.out.println("Ingrese nombre de Estacion");
            String estacion = sc.nextLine();
            sc.nextLine();
            estaciones[counterEstacion] = estacion;
            kmRecorrido = kmRecorrido + 100;
            kmEstaciones[counterEstacion] = kmRecorrido;
            counterEstacion++;
        }
        if (km >= 100) {
            System.out.println("Ida:");
            for (int i = 0; i < estaciones.length; i++) {
                System.out.println("Estacion:" + estaciones[i] + ", km. recorrido: " + kmEstaciones[i]);
            }
            System.out.println("Vuelta:");
            for (int i = estaciones.length - 1; i >= 0; i--) {
                kmRecorrido = kmRecorrido + 100;
                System.out.println("Estacion:" + estaciones[i] + ", km. recorrido: " + kmRecorrido);
            }
        }

    }
}
