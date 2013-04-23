package dsttime;

/**
 * A strategy interface for phone cost counter.
 * 
 * @author yfwz100
 */
public interface PhoneCostStrategy {
    
    /**
     * Get the cos according to the minutes.
     * 
     * @param minutes the minutes to calculate the cost.
     * @return the money.
     */
    Double getCost(long minutes);
}
