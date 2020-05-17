package com.dsmanioto.statewatch.statewatch.implementation;

import com.dsmanioto.statewatch.statewatch.Stopwatch;

public class RunningState implements State {
	
	private Stopwatch stopwatch;
	
	public RunningState(Stopwatch stopwatch) {
		this.stopwatch = stopwatch;
	}
	
	@Override
	public void click() {
		stopwatch.setCurrentState(new StopState(stopwatch));
		System.out.println("Stopping");
	}
	
}
