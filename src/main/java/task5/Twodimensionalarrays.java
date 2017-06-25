package task5;

/**
 * Created by Вениамин on 6/25/2017.
 */
public class Twodimensionalarrays {

    public static int[][] matrixInit(int number) {
        int[][] massive = new int[number][number];

        for(int i = 0; i < massive.length; ++i) {
            for(int j = 0; j < massive[i].length; ++j) {
                massive[i][j] = j != i && j != number - i - 1?0:1;
            }
        }

        return massive;
    }
}
