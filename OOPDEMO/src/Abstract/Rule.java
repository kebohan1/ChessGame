package Abstract;

import java.util.ArrayList;

public interface Rule {
	public void overRule(ArrayList<AbstractPawn> pawns);  //�٤��T�w�^�ǩM�ǤJ
	public void moveRule(AbstractPawn pawn, int x, int y);
	public void eatRule(AbstractPawn pawn);
}
