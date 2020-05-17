package com.dsmanioto.statewatch.statewatch.implementation;

import com.dsmanioto.statewatch.statewatch.Stopwatch;

public class StopState implements State {
	
	private Stopwatch stopwatch;
	
	public StopState(Stopwatch stopwatch) {
		this.stopwatch = stopwatch;
	}
	
	@Override
	public void click() {
		stopwatch.setCurrentState(new RunningState(stopwatch));
		System.out.println("Running");
	}
	
	
}
