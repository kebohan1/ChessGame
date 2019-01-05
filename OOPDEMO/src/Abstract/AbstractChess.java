package Abstract;

import java.util.ArrayList;

public abstract class AbstractChess {
	abstract public AbstractBoard createChessBoard(ArrayList<AbstractPawn> pawns,Rule rule);
	abstract public ArrayList<AbstractPawn> createPawn();
	abstract public Rule createRule();
}
