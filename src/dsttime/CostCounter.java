/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsttime;

/**
 *
 * @author robinhood
 */
public class CostCounter {
    private Long startTime;
    private Long endTime;
    private boolean flag;
    private Long currentTime;
    
    {
        this.reset();
    }
    public void Start()
    {
        this.flag=true;
        this.startTime=System.currentTimeMillis()-1000;
    }
    
    public void Stop()
    {
        this.flag=false;
        this.endTime=System.currentTimeMillis();
    }
    
    public Long currentTime()
    {
        if(this.flag==false)
        {
            return currentTime;
        }
        return currentTime=System.currentTimeMillis()-this.startTime;
    }
    
    public Long getDuration()
    {
        return this.endTime-this.startTime;
    }
    
    public void reset()
    {
         this.startTime=0L;
        this.endTime=0L;
        this.flag=false;
        this.currentTime=0L;
    }
}
