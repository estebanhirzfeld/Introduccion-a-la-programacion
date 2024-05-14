import java.util.Scanner;

public class task_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int prev_number = 0;
        int number = 0;
        int highest_number = 0;
        int lowest_number = 0;
        
        for (int i = 0; i < 10; i++) {
            number = (int)(Math.random()*100);
            System.out.println("random number: " + number);
            
            if (prev_number < number){
                highest_number = number;
            }
            if (lowest_number > number || lowest_number == 0){
                lowest_number = number;
            }
        }

        System.out.println("------------------");
        System.out.println("lowest_number: " + lowest_number);
        System.out.println("highest_number: " + highest_number);
    }
}
