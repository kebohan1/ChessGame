package Abstract;

public interface Rule {
	public void overRule(AbstractPawn[] pawns);  //�٤��T�w�^�ǩM�ǤJ
	public void moveRule(AbstractPawn pawn, int x, int y);
	public void eatRule(AbstractPawn pawn);
}
