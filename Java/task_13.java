
public class task_13 {

    public static void main(String[] ars) throws InterruptedException {
        int HEIGHT = 10;
        int WIDTH = 10;
        char[][] screenMatrix = new char[HEIGHT][WIDTH];

        for (int x = 0; x < 10; x++) {
            for (int i = 0; i < HEIGHT; i++) {
                for (int j = 0; j < WIDTH; j++) {
                    String b = Integer.toString(x);    
                    screenMatrix[i][j] = b.charAt(0);
                    System.out.print(screenMatrix[i][j]);
                }
                System.out.println();
            }
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
