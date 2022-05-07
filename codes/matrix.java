import java.io.*;
public class matrix {
    public static int[][] Naive(int[][] p, int[][] q, int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += p[i][k] * q[k][j];
                }
            }
        }
        return result;
    }
    public int[][] multiplyDAC(int[][] A, int[][] B) {
        int n = A.length;
        int[][] R = new int[n][n];
        if (n == 1)
            R[0][0] = A[0][0] * B[0][0];
        else {
            int[][] A11 = new int[n / 2][n / 2];
            int[][] A12 = new int[n / 2][n / 2];
            int[][] A21 = new int[n / 2][n / 2];
            int[][] A22 = new int[n / 2][n / 2];
            int[][] B11 = new int[n / 2][n / 2];
            int[][] B12 = new int[n / 2][n / 2];
            int[][] B21 = new int[n / 2][n / 2];
            int[][] B22 = new int[n / 2][n / 2];
            split(A, A11, 0, 0);
            split(A, A12, 0, n / 2);
            split(A, A21, n / 2, 0);
            split(A, A22, n / 2, n / 2);
            split(B, B11, 0, 0);
            split(B, B12, 0, n / 2);
            split(B, B21, n / 2, 0);
            split(B, B22, n / 2, n / 2);
            int[][] C11 = add(multiplyDAC(A11, B11), multiplyDAC(A12, B21));
            int[][] C12 = add(multiplyDAC(A11, B12), multiplyDAC(A12, B22));
            int[][] C21 = add(multiplyDAC(A21, B11), multiplyDAC(A22, B21));
            int[][] C22 = add(multiplyDAC(A21, B12), multiplyDAC(A22, B22));
            join(C11, R, 0, 0);
            join(C12, R, 0, n / 2);
            join(C21, R, n / 2, 0);
            join(C22, R, n / 2, n / 2);
        }
        return R;
    }
    public int[][] multiplyStrassen(int[][] A, int[][] B) {
        int n = A.length;
        int[][] R = new int[n][n];
        if (n == 1)
            R[0][0] = A[0][0] * B[0][0];
        else {
            int[][] A11 = new int[n / 2][n / 2];
            int[][] A12 = new int[n / 2][n / 2];
            int[][] A21 = new int[n / 2][n / 2];
            int[][] A22 = new int[n / 2][n / 2];
            int[][] B11 = new int[n / 2][n / 2];
            int[][] B12 = new int[n / 2][n / 2];
            int[][] B21 = new int[n / 2][n / 2];
            int[][] B22 = new int[n / 2][n / 2];
            split(A, A11, 0, 0);
            split(A, A12, 0, n / 2);
            split(A, A21, n / 2, 0);
            split(A, A22, n / 2, n / 2);
            split(B, B11, 0, 0);
            split(B, B12, 0, n / 2);
            split(B, B21, n / 2, 0);
            split(B, B22, n / 2, n / 2);
            int[][] M1 = multiplyStrassen(add(A11, A22), add(B11, B22));
            int[][] M2 = multiplyStrassen(add(A21, A22), B11);
            int[][] M3 = multiplyStrassen(A11, sub(B12, B22));
            int[][] M4 = multiplyStrassen(A22, sub(B21, B11));
            int[][] M5 = multiplyStrassen(add(A11, A12), B22);
            int[][] M6 = multiplyStrassen(sub(A21, A11), add(B11, B12));
            int[][] M7 = multiplyStrassen(sub(A12, A22), add(B21, B22));
            int[][] C11 = add(sub(add(M1, M4), M5), M7);
            int[][] C12 = add(M3, M5);
            int[][] C21 = add(M2, M4);
            int[][] C22 = add(sub(add(M1, M3), M2), M6);
            join(C11, R, 0, 0);
            join(C12, R, 0, n / 2);
            join(C21, R, n / 2, 0);
            join(C22, R, n / 2, n / 2);
        }
        return R;
    }
    public int[][] sub(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }
    public int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }
    public void split(int[][] P, int[][] C, int iB, int jB) {
        for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                C[i1][j1] = P[i2][j2];
    }
    public void join(int[][] C, int[][] P, int iB, int jB) {
        for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                P[i2][j2] = C[i1][j1];
    }
    public static int[][] createMatrix(int n) {
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
        return mat;
    }
    public static void main(String args[]) {
        double[] n = new double[3];
        double[] d = new double[3];
        double[] s = new double[3];
        long t1, t2;
        int[] test = { 16, 32, 8 };
        for (int i = 0; i < 3; i++) {
            int[][] p = createMatrix(test[i]);
            int[][] q = createMatrix(test[i]);

            matrix m = new matrix();
            t1 = System.nanoTime();
            int[][] result = m.Naive(p, q, test[i]);
            t2 = System.nanoTime();
            n[i] = (double) Math.round((t2 - t1) * 0.000001 * 10000d) / 10000d;
            t1 = System.nanoTime();
            m.multiplyDAC(p, q);
            t2 = System.nanoTime();
            d[i] = (double) Math.round((t2 - t1) * 0.000001 * 10000d) / 10000d;
            t1 = System.nanoTime();
            m.multiplyDAC(p, q);
            t2 = System.nanoTime();
            s[i] = (double) Math.round((t2 - t1) * 0.000001 * 10000d) / 10000d;
            System.out.println(test[i]);
            System.out.println("naive: "+n[i]);
            System.out.println("DAC method: "+d[i]);
            System.out.println("Strassen method: "+s[i]);
            System.out.println();
        }
        try {
            FileWriter fw = new FileWriter("multiplicationoutput.txt", false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < 3; i++) {
                pw.println(n[i] + "," + d[i] + "," + s[i]);
            }
            pw.flush();
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}