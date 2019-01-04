package DC;
import Abstract.AbstractBoard;
import Abstract.AbstractPawn;
import Abstract.Rule;
import Abstract.Type;
import java.util.Random;
public class DCPawn extends AbstractPawn {
	
	final int liveAndDark = 0;
	final int liveAndLight = 1;
	final int dead = 2;
	
	Random random = new Random();
	
	boolean color;
	int x,y,weight,state;
	public DCPawn(Rule rule, Type type,AbstractBoard board) {
		super(rule, type, board);
		state = liveAndDark;
		do {
			x = random.nextInt(8);
			y = random.nextInt(4);
		}while(board.getLocation(x,y));
		board.setLocation(x,y);
		
	}

	@Override
	public void move(int nextx, int nexty) {
		if(board.getLocation(nextx, nexty)) {
			eat()
		}
		
	}

	@Override
	public void eat(AbstractPawn pawn) {

	}

}
