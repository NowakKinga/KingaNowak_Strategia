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
public class Selectionsort implements ISortStrategy {
    @Override
    public void sort(double[] doubleTab) {
        int n = doubleTab.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (doubleTab[j] < doubleTab[min_idx])
                    min_idx = j;

            double temp = doubleTab[min_idx];
            doubleTab[min_idx] = doubleTab[i];
            doubleTab[i] = temp;
        }
    }
}
