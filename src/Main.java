import java.util.Arrays;

public class Main {

    public static double[] gaussElimination(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];

        for (int i = 0; i < n; i++) {
            int maxRow = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(A[k][i]) > Math.abs(A[maxRow][i])) {
                    maxRow = k;
                }
            }

            double[] temp = A[i];
            A[i] = A[maxRow];
            A[maxRow] = temp;

            double t = b[i];
            b[i] = b[maxRow];
            b[maxRow] = t;

            for (int k = i + 1; k < n; k++) {
                double factor = A[k][i] / A[i][i];
                b[k] -= factor * b[i];
                for (int j = i; j < n; j++) {
                    A[k][j] -= factor * A[i][j];
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }

        return x;
    }

    public static double[] interpolationPolynomial(double[][] points) {
        int n = points.length;
        double[][] X = new double[n][n];
        double[] Y = new double[n];

        for (int i = 0; i < n; i++) {
            double x = points[i][0];
            Y[i] = points[i][1];
            for (int j = 0; j < n; j++) {
                X[i][j] = Math.pow(x, j);
            }
        }

        return gaussElimination(X, Y);
    }

    public static void main(String[] args) {
        double[][] points = {{1, 2}, {2, 3}, {3, 5}};
        double[] coeffs = interpolationPolynomial(points);
        System.out.println("Coeficientes do polinômio interpolador: " + Arrays.toString(coeffs));
    }
}
