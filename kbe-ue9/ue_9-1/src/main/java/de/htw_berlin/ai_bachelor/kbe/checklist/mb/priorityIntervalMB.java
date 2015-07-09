package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="list", eager=true)
@SessionScoped
public class priorityIntervalMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private final int min = 1;
	private int max;
    
	public priorityIntervalMB() {
		this.max = 2;
	}    

	public priorityIntervalMB(int max) {
		this.max = max;
	}	

    public String save() {
    	return "save";
    }
    
}
