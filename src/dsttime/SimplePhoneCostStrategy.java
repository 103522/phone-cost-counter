/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsttime;

/**
 *
 * @author robinhood
 */
public class SimplePhoneCostStrategy implements PhoneCostStrategy {

    @Override
    public Double getCost(long minutes) {
        if(minutes>1200)
        {
            throw new UnsupportedOperationException();
        }
        if(minutes<=20)
        {
            return minutes*0.05;
        }
        else
        {
            return 1+0.1*(minutes-20);
        }
    }
    
}
