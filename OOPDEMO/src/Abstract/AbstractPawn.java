package Abstract;

public abstract class AbstractPawn {

	protected Rule rule ;
	protected Type type ;
	protected AbstractBoard board;
	public AbstractPawn(Rule rule, Type type,AbstractBoard board) {
		this.rule = rule;
		this.type = type;
		this.board = board;
	}
	
	abstract public void move(int x,int y);	
	abstract public void eat(AbstractPawn pawn);
}
