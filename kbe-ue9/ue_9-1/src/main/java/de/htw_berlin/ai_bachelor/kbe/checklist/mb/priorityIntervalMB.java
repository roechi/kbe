package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Min;

@ManagedBean(name="priority", eager=true)
@ApplicationScoped
public class priorityIntervalMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Min(value=1)
	private int min;
	private int max;
    
	public priorityIntervalMB() {
		this.min = 1;
		this.max = 2;
	}    

	public priorityIntervalMB(int max) {
		this.max = max;
	}	

    public String save() {
    	return "save";
    }
    
    public int getMin() {
    	return min;
    }
    
    public void setMin(int min) {
    	this.min = min;
    }
    
    public int getMax() {
    	return max;
    }
    
    public void setMax(int max) {
    	this.max = max;
    }
    
}
