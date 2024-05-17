
public class task_17 {

    public static Integer fibo(Integer num) {
        if (num <= 5 && num >= 0) {
            System.out.println(num);
            return num + fibo(num - 1);
        }
        return 5;
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
