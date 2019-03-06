package com.ahs.limitsservice.bean;

public class LimitConfiguration {
    
    int maximun;
    int minimun;
    
    public LimitConfiguration() {}
    
    public int getMaximun(){
        return maximun;
    }
    
    public void setMaximun(
        int maximun){
        this.maximun = maximun;
    }
    
    public int getMinimun(){
        return minimun;
    }
    
    public void setMinimun(
        int minimun){
        this.minimun = minimun;
    }
    
    public LimitConfiguration(int maximun, int minimun) {
        super();
        this.maximun = maximun;
        this.minimun = minimun;
    }
    
}
