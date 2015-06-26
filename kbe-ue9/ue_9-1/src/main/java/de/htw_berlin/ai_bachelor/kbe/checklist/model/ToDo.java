package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;


public class ToDo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String name;
	private boolean done = false;
	private Date date;
	
	private ToDo(String name, boolean done, Date date) {
		super();
		this.name = name;
		this.done = done;
		this.date = date;
	}
	
	public ToDo(String name, Date date) {
		this(name, false, date);
	}
	
	public ToDo(String name) {
		this(name,false, new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		Date tomorrow = calendar.getTime();
		setDate(tomorrow);
	}
	
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}

}
