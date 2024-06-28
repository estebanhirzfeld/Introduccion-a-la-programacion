
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Integer[] list = {4,1,3,7};

        System.out.println("Before:");
        for (Integer integer : list) {
            System.out.print(integer);
        }
        System.out.println();
        System.out.println("After:");
        for (int k = list.length-2; k >= 0; k--){
            for (int j = 0; j <= k ;j++){
                if(list[j]>list[j+1]){
                    int aux = list[j];
                    list[j] = list[j+1];
                    list[j+1] = aux;
                }
            }
        }
        for (Integer integer : list) {
            System.out.print(integer);
        }
    }
}