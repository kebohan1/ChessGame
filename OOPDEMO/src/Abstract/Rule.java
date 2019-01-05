package Abstract;

import java.util.ArrayList;

public interface Rule {
	public boolean overRule(ArrayList<AbstractPawn> pawns);  //�٤��T�w�^�ǩM�ǤJ
	public ArrayList<AbstractPawn> moveRule(ArrayList<AbstractPawn> pawns,AbstractPawn pawn, int x, int y);

}
