package de.htw_berlin.ai_bachelor.kbe.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener implements PhaseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void afterPhase(PhaseEvent arg0) {
		System.out.println("Entering Phase: " + this.getPhaseId().getName().toString());
	}

	public void beforePhase(PhaseEvent arg0) {
		System.out.println("Exiting Phase: " + this.getPhaseId().toString());
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
