public class pattern2
{
    public static void main(String[] args) {
        int rows = 5;
        int spaces = 0;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
        }
    }
}