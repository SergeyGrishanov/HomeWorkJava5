// Реализовать алгоритм сортировки слиянием (MergeSort).

package work5;

import java.util.Arrays;

public class work5 {
       
   public void sort(int[] values) {
    int[] sortedValues = mergesort(values);
    for (int i = 0; i < values.length; i++) {
      values[i] = sortedValues[i];
    }
  }

  public static int[] mergesort(int[] ar) {
    
    int n = ar.length;
    if (n <= 1) return ar;

    
    int[] left = mergesort(Arrays.copyOfRange(ar, 0, n / 2));
    int[] right = mergesort(Arrays.copyOfRange(ar, n / 2, n));

    
    return merge(left, right);
  }

  
  private static int[] merge(int[] ar1, int[] ar2) {
    int n1 = ar1.length, n2 = ar2.length;
    int n = n1 + n2, i1 = 0, i2 = 0;
    int[] ar = new int[n];

    for (int i = 0; i < n; i++) {
      if (i1 == n1) {
        ar[i] = ar2[i2++];
      } else if (i2 == n2) {
        ar[i] = ar1[i1++];
      } else {
        if (ar1[i1] < ar2[i2]) {
          ar[i] = ar1[i1++];
        } else {
          ar[i] = ar2[i2++];
        }
      }
    }
    return ar;
  }

  public static void main(String[] args) {
    int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
        number[i] = ((int)(Math.random() * 100 -50));
        }
        System.out.printf("Список целых чисел: %s \n", java.util.Arrays.toString(number));
        number = mergesort(number);
        
     System.out.println(java.util.Arrays.toString(number));
  }
}
