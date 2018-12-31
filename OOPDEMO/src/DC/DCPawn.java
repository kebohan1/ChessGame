package DC;
import Abstract.AbstractBoard;
import Abstract.AbstractPawn;
import Abstract.Rule;
import Abstract.Type;
import java.util.Random;
public class DCPawn extends AbstractPawn {
	Random random = new Random();
	boolean life,color;
	int x,y,weight;
	public DCPawn(Rule rule, Type type,AbstractBoard board) {
		super(rule, type, board);
		do {
			x = random.nextInt(8);
			y = random.nextInt(4);
		}while(board.getLocation(x,y));
		
	}

	@Override
	public void move(int x, int y) {
		if(type != type.¥]|| type != type.¬¶) {
			
		}
		
	}

	@Override
	public void eat(AbstractPawn pawn) {

	}

}
