package Abstract;

import java.util.ArrayList;

public abstract class AbstractBoard<E> {
	protected ArrayList<E> pawns;
	protected Rule rule;
	
	public AbstractBoard(ArrayList<E> pawns,Rule rule) {
		this.pawns = pawns;
		this.rule = rule;
	}
	
	abstract public void move(AbstractPawn pawn, int x,int y);	
	abstract public void eat(AbstractPawn Hunter,AbstractPawn prey);
}
