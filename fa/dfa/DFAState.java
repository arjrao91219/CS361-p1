package fa.dfa;

import java.util.Map;
import java.util.HashMap;

import fa.State;

public class DFAState extends State{

    private boolean isFinal;

    private final Map<Character, DFAState> transitions;

    public DFAState(String name) {
		super(name);
		isFinal = false;
		transitions = new HashMap<>();
	}

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public Map<Character, DFAState> getTransitions() {
        return transitions;
    }

    public DFAState getTransition(char symb) {
		return transitions.get(symb);
	}

	public void setTransition(char symb, DFAState to) {
		transitions.put(symb, to);
	}
    
}
