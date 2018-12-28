package Abstract;

public abstract class AbstractPawn {

	Rule rule ;
	Type type ;
	
	public AbstractPawn(Rule rule, Type type) {
		this.rule = rule;
		this.type = type;
	}
	
	abstract public void move(int x,int y);	
	abstract public void eat(AbstractPawn pawn);
}
