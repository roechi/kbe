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
		if (arg0.getPhaseId().getName().equals(PhaseId.RESTORE_VIEW.getName()) || 
				arg0.getPhaseId().getName().equals(PhaseId.RENDER_RESPONSE.getName())) {
			if (arg0.getPhaseId().getName().equals(PhaseId.RESTORE_VIEW.getName()))
				System.out.println("Is Postack Request: " + arg0.getFacesContext().isPostback());
			System.out.println("ID of component tree root: " + arg0.getFacesContext().getViewRoot().getId());
			System.out.println("Number of nodes in view component tree: " + arg0.getFacesContext().getViewRoot().getChildCount());
		} else
			System.out.println("Exiting Phase: " + arg0.getPhaseId().getName().toString());
	}

	public void beforePhase(PhaseEvent arg0) {
		System.out.println("Entering Phase: " + arg0.getPhaseId().getName().toString());
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
