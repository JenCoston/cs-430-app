package persons.states;

import java.util.ArrayDeque;

public class StateQueue {
	private ArrayDeque<NonPlayerState> queue;
	
	public StateQueue() {
		queue = new ArrayDeque<NonPlayerState>();
	}
	
	public void addImmediateState(NonPlayerState n) {
		queue.addFirst(n);
	}
	
	public void addState(NonPlayerState n) {
		queue.add(n);
	}
	
	public NonPlayerState head() {
		return queue.peekFirst();
	}
	
	public void removeState() {
		queue.removeFirst();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
}
