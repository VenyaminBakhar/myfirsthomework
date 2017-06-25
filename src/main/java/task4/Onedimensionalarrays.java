package task4;

/**
 * Created by Вениамин on 6/25/2017.
 */
class Onedimensionalarrays {

    static void maxAmount(double... values) {
        double[] arrOfValues = new double[values.length];
        double[] valuesAmounts = new double[arrOfValues.length / 2];
        int index = 0;
        double[] maxCount = values;
        int var5 = values.length;

        int i;
        for(i = 0; i < var5; ++i) {
            double val = maxCount[i];
            arrOfValues[index] = val;
            ++index;
        }

        if(arrOfValues.length % 2 == 0) {
            for(int var9 = 0; var9 < arrOfValues.length / 2; ++var9) {
                valuesAmounts[var9] = arrOfValues[var9] + arrOfValues[arrOfValues.length - var9 - 1];
            }

            double var10 = valuesAmounts[0];

            for(i = 1; i < valuesAmounts.length; ++i) {
                if(var10 < valuesAmounts[i]) {
                    var10 = valuesAmounts[i];
                }
            }

            System.out.println(var10);
        } else {
            System.out.println("необходимо чётное число элементов");
        }

    }
}
