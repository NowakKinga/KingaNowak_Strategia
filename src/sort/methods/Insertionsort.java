/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import sort.strategy.ISortStrategy;

/**
 *
 * @author LeopardProMK
 */
public class Insertionsort implements ISortStrategy{
    @Override
    public void sort(double[] doubleTab) {
        int n = doubleTab.length;
        for (int i = 1; i < n; ++i) {
            double key = doubleTab[i];
            int j = i - 1;

            while (j >= 0 && doubleTab[j] > key) {
                doubleTab[j + 1] = doubleTab[j];
                j = j - 1;
            }
            doubleTab[j + 1] = key;
        }
    }
}