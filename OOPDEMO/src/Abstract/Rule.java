package Abstract;

import java.util.ArrayList;

public interface Rule {
	public void overRule(ArrayList<AbstractPawn> pawns);  //�٤��T�w�^�ǩM�ǤJ
	public void moveRule(ArrayList<AbstractPawn> pawns,AbstractPawn pawn, int x, int y);
	public void eatRule(AbstractPawn Hunter,AbstractPawn prey);
}
