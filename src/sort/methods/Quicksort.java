/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import java.util.Arrays;

/**
 *
 * @author LeopardProMK
 */
public class Quicksort implements Sort {
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-szybkie-quicksort/quick-j.html */
    @Override
    public double[] sort(double[] arr) {
      Arrays.sort(arr);
      return arr;
    }
}
