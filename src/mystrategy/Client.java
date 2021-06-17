/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import java.util.Arrays;
import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;
import sort.strategy.Context;
import sort.strategy.ISortStrategy;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] dataNonSort = DataGenerator.generate(100000); //liczbę 100000 można zmienić na inną dowolną
        
       /* Wzorzec Stratega */
        //...
       //Pierwsza metoda sortowania
       Context sortContext = new Context(new Selectionsort()); //selecting the sort method
       sortContext.arrange(dataNonSort);
       double time = sortContext.sortedDoubleTab(dataNonSort);
       Arrays.stream(dataNonSort).forEach( x -> System.out.println(x));
       
       //Druga metoda sortowania
       Context sortContext1 = new Context((ISortStrategy) new Bubblesort());
       sortContext1.arrange(dataNonSort);
       double time1 = sortContext1.sortedDoubleTab(dataNonSort);
       Arrays.stream(dataNonSort).forEach( x -> System.out.println(x));
       
       //Trzecia metoda sortowania
       Context sortContext2 = new Context(new Insertionsort());
       sortContext2.arrange(dataNonSort);
       double time2 = sortContext2.sortedDoubleTab(dataNonSort);
       Arrays.stream(dataNonSort).forEach( x -> System.out.println(x));
       
       //Czwarta metoda sortowania
       Context sortContext3 = new Context((ISortStrategy) new Quicksort());
       sortContext3.arrange(dataNonSort);
       double time3 = sortContext3.sortedDoubleTab(dataNonSort);
       Arrays.stream(dataNonSort).forEach( x -> System.out.println(x));
       
        System.out.println("Time: ??");
    }
}
