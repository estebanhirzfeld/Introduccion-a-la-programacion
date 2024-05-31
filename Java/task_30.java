

public class task_30 {

    public static void main(String[] args) {
        Integer numbers[] = {62,12,67,77,40,56,62,12,49,42,67,8,67,3};
        Integer min = numbers[0];
        Integer max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]){
                min = numbers[i];
            }
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
