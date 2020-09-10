package arrays;

public class TwoDimensionalArray {
    public static void main(String args[]) {
        int twoDimensional[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoDimensional[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoDimensional[i][j] + " ");
            System.out.println();
        }
    }
}
