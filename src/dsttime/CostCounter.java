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
        this.startTime=0L;
        this.endTime=0L;
        this.flag=false;
        this.currentTime=0L;
    }
    public void Start()
    {
        this.flag=true;
        this.startTime=System.currentTimeMillis();
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
            return 0L;
        }
        return System.currentTimeMillis()-this.startTime;
    }
    
    public Long getDuration()
    {
        return this.endTime-this.startTime;
    }
    
}
