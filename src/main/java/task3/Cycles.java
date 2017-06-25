package task3;

/**
 * Created by Вениамин on 6/25/2017.
 */
class Cycles {

    Cycles(){}

    public  void function(double a, double b, double h) {
        double boundaryValue = (b - a) / h;
        int countOfSteps = boundaryValue % 1.0D == 0.0D?(int)boundaryValue - 1:(int)boundaryValue;

        for(int i = 0; i <= countOfSteps; ++i) {
            double x = a + (double)i * h;
            double funcResult = Math.tan(2.0D * x) - 3.0D;
            System.out.println("x:=" + x + " F(x)=" + funcResult);
        }

    }
}
