/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.strategy;

/**
 *
 * @author kinga
 */
public class Context {
    private final ISortStrategy iSortStrategy;
    
    public Context(ISortStrategy iSortStrategy) {
        this.iSortStrategy = iSortStrategy;
    }

    public double sortedDoubleTab(double[] doubleTab){
        Stopwatch stopwatch=new Stopwatch();
        iSortStrategy.sort(doubleTab);
        return stopwatch.elapsedTime();
    }

    public void arrange(double[] dataNonSort) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
