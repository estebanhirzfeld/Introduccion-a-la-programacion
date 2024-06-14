
// 10 estudiantes, nombres y notas (una sola)
// nombre por usuario, nota aleatoria
import java.util.Scanner;

public class exam_ej_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alumnos = new String[5];
        Integer[] notas = new Integer[5];
        Integer maxNota = 0;
        String maxNotaAlumno = null;
        Double totalNotas = 0.0;

        Integer nota = (int) (Math.random() * 10);

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese nombre del alumno");
            String alumno = sc.nextLine();
            nota = (int) (Math.random() * 10);
            alumnos[i] = alumno;
            notas[i] = nota;
        }
        System.out.println("Lista Completa: ");
        for (int i = 0; i < alumnos.length; i++) {
            totalNotas = totalNotas + notas[i];
            if (notas[i] > maxNota) {
                maxNota = notas[i];
                maxNotaAlumno = alumnos[i];
            }
            System.out.println("Alumno: " + alumnos[i] + " nota: " + notas[i]);

        }
        System.out.println("----------------------------------");
        System.out.println("Notas Promocionadas:");
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] >= 7) {
                System.out.println("Alumno: " + alumnos[i] + " nota: " + notas[i]);
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Notas Aprobadas:");
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] >= 4) {
                System.out.println("Alumno: " + alumnos[i] + " nota: " + notas[i]);
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Notas Desaprobadas:");
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] < 4) {
                System.out.println("Alumno: " + alumnos[i] + " nota: " + notas[i]);
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Nota Maxima:");
        System.out.println("Alumno: " + maxNotaAlumno + " nota: " + maxNota);
        System.out.println("----------------------------------");
        System.out.println("Promedio General:");
        System.out.println(totalNotas / notas.length);
    }
}
