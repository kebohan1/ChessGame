package CC;

import java.util.ArrayList;

import Abstract.AbstractBoard;
import Abstract.AbstractPawn;
import Abstract.Rule;

public class CCBoard extends AbstractBoard {

	public CCBoard(ArrayList<AbstractPawn> pawns,Rule rule) {
		super(pawns,rule);
		// TODO Auto-generated constructor stub
	}

	public void move(AbstractPawn pawn, int x,int y) {
		rule.moveRule(pawns, pawn, x, y);
	}
	public void eat(AbstractPawn Hunter,AbstractPawn prey) {
		rule.eatRule(Hunter,prey);
	}

}
