package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;

@ManagedBean(name="list")
@SessionScoped
public class ToDoListMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private ToDoList toDoList;
    private String testMessage;
    
	public ToDoListMB() {
		super();
		this.toDoList = new ToDoList();
		this.testMessage = "Dies ist ein Test";
	}    

	//TODO
    public ToDoList getToDoList() {
        return toDoList;
    }
    
    public String getTestMessage() {
    	return testMessage;
    }

	//Should be called if the Button "Speichern" is pushed.
	//Needs configuration in the faces-config.xml.
    public String save() {
    	return "save";
    }
}
