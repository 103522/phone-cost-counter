/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsttime;

/**
 *
 * @author robinhood
 */
public class TransMillToSimple {
    public static String TransMill(Long millSecond)
    {
        Long wholeSecond=millSecond/1000;
        Long minute=wholeSecond/60;
        Long second=wholeSecond%60;
        return minute.toString()+":"+second.toString();
    }
}
