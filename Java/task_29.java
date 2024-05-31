
import java.util.Scanner;

public class task_29 {

    public static void main(String[] args) {

        String[] product = {"Mayonesa H.",
            "Mostaza N.",
            "Chimichurri H.",
            "Refresco P.",
            "Refresco CC.",
            "Refresco F.",
            "Dulce de leche S.",
            "Dulce de leche LS.",
            "Galletas O.",
            "Galletas F.",};

        double[] price = {1599.00,
            1480.00,
            3500.00,
            2200.00,
            2500.00,
            2000.00,
            2199.00,
            2850.00,
            1249.00,
            1100.00};

        int[] disc = {15, 15, 0, 0, 10, 0, 20, 22, 10, 0};

        Scanner sc = new Scanner(System.in);

        String list[] = new String[10];
        Integer index = 0;
        for (int i = 0; i < product.length; i++) {
            if (disc[i] == 10 || price[i] >= 2000) {
                list[index] = product[i];
                index++;
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Lista:");
        System.out.println("");

        for (int i = 0; i < index; i++) {
            System.out.println(list[i] + ": $" + price[i]);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Refrescos:");
        System.out.println("");

        for (int i = 0; i < list.length; i++) {
            if (product[i].contains("Refresco")) {
                System.out.println(product[i] + ": $" + price[i] + ", descuento: " + disc[i] + "%");
                // System.out.println(MessageFormat.format("{0} ${1}, descuento:{2}%", product[i], price[i], disc[i]));
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Total por todo:");
        System.out.println("");

        Double total_price = 0.0;
        for (int i = 0; i < product.length; i++) {
            total_price = total_price + price[i];
        }
        System.out.println("$" + total_price);

        System.out.println("Inicie Busqueda:");
        String search = sc.nextLine();
        Boolean was_find = false;
        System.out.println("----------------------------------------------------");
        System.out.println("Searching for " + search + "...");
        System.out.println("");

        for (int i = 0; i < list.length; i++) {
            if (product[i].toLowerCase().contains(search)) {
                System.out.println("Product found:");
                System.out.println(product[i] + ": $" + price[i] + ", descuento: " + disc[i] + "%");
                was_find = true;
            }
        }
        if (!was_find) {
            System.out.println("Product: '" + search + "' not found:");
        }
    }
}
