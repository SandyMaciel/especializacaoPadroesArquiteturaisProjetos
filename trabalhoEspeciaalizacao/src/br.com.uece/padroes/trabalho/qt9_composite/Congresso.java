package qt9_composite;

import java.util.List;

public abstract class Congresso {
	
	public abstract void add(Congresso c);
	public abstract void remove(Congresso c);
	public abstract List<Congresso> getChild();
	
	public abstract void inscritos();
	
	
}
