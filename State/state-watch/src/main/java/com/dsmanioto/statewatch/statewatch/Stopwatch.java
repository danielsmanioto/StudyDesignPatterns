package com.dsmanioto.statewatch.statewatch;

import com.dsmanioto.statewatch.statewatch.implementation.State;
import com.dsmanioto.statewatch.statewatch.implementation.StopState;

public class Stopwatch {
	
	private State currentState = new StopState(this);
	
	public void click() {
		currentState.click();
	}
	
	public State getCurrentState() {
		return currentState;
	}
	
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
}
