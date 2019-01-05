package Abstract;

public abstract class AbstractBoard {
	protected AbstractPawn[] pawns;
	protected Rule rule;
	
	public AbstractBoard(AbstractPawn[] pawns,Rule rule) {
		this.pawns = pawns;
		this.rule = rule;
	}
	
	abstract public void move(AbstractPawn pawn, int x,int y);	
	abstract public void eat(AbstractPawn pawn);
}
