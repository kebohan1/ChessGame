package Abstract;

public interface Rule {
	public void overRule(AbstractPawn[] pawns);  //還不確定回傳和傳入
	public void moveRule(AbstractPawn pawn, int x, int y);
	public void eatRule(AbstractPawn pawn);
}
