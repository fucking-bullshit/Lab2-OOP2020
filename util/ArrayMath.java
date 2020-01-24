import java.util.ArrayList;
import java.util.List;

/**
 * Mathematical functions for arrays.
 *
 * @author Nanthakarn Limkool
 */
public class ArrayMath {
  /**
   * Compute and return the average of an array of values.
   * 
   * @param x array of double values. May have length 0.
   * @return the average of values in x. If array has length 0 then the average is
   *         0.0.
   */
  public static double average(double[] x) {
    if (x.length == 0)
      return 0.0;

    int n = 0;
    double total = 0.0;

    while (n < x.length) {
      total += x[n];
      n++;
    }
    return (double) total / x.length;
  }

  /**
   * Compute and return the sum of two points(arrays), using dotProduct.
   * 
   * @param x, y array of double values.
   * @return the dotProduct of x and y points.
   */
  public static double dotProduct(double[] x, double[] y) {
    List<Double> new_Array = new ArrayList<Double>();
    int samller;
    double summ = 0.0;

    if (x.length <= y.length)
      samller = x.length;
    else
      samller = y.length;

    for (int i = 0; i < samller; i++) {
      double num = x[i] * y[i];
      new_Array.add(num);
    }
    for (double nunber : new_Array) {
      summ += nunber;
    }
    return summ;
  }

  /**
   * Find and return the maximal element in x. If x is emty, return -Infinity.
   * 
   * @param x x array of double values. May have length 0.
   * @return the maximal element of x, or -Infinity, when x is emty.
   */
  public static double max(double[] x) {
    double maxNum = Double.NEGATIVE_INFINITY;

    for (double num : x) {
      if (num > maxNum)
        maxNum = num;
    }
    return maxNum;
  }

  /**
   * Compute and return the value of a polynomial with coefficients in array a,
   * evaluated at x.
   * 
   * @param x a number that will be the power of p(x)
   * @param a an array of double values.
   * @return the value of a polynomial
   */
  public static double polyval(double x, double[] a) {
    double poly = 0.0;
    int n = a.length - 1;

    for (int k = n; k >= 0; k--) {
      poly = poly * x + a[k];
    }
    return poly;
  }

  /**
   * Compute and return the Euclidean Norm of an array(x).
   * 
   * @param x an array of double values.
   * @return the Euclidean Norm of x
   */
  public static double norm(double[] x) {
    double norm = 0.0;

    for (double i : x) {
      norm += Math.pow(i, 2);
    }
    return Math.sqrt(norm);
  }
}