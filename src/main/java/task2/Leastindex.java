package task2;

/**
 * Created by Вениамин on 6/25/2017.
 */
public class Leastindex {

    public static void findLeastElement(double e) {
        int n = (int)(1.0D / Math.sqrt(e));
        System.out.println("наименьший номер элемента последовательности: " + n);

        for(int i = 1; i <= n; ++i) {
            double element = 1.0D / Math.pow((double)(i + 1), 2.0D);
            System.out.println("a" + i + ": " + element);
        }

    }
}
